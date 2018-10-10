package com.kashif.streams;

import java.util.Arrays;
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
    }

}
