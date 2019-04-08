package com.kashif.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream {
    
    public static void main(String[] args) {
        List<Integer> staff = Arrays.asList(1,2,3,4,5 );
        
        // [1,4,9,16,25]
        
        List<Integer> collect = staff.stream()
        		                .map(x -> x * x)
        		                .filter(x -> x != 4)
        		                .collect(Collectors.toList());
        System.out.println(collect);
        
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);
        
        List numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> (int)x).summaryStatistics();
        System.out.println(String.format("Max: %d, Min: %d, Count %d, Sum %d, Average %d", stats.getMax(), stats.getMin(), stats.getCount(), stats.getSum(), stats.getAverage()));
    }

}
