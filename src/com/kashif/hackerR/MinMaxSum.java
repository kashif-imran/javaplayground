package com.kashif.hackerR;

import java.util.Scanner;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

    	long max = arr[0], min = arr[0], sum = 0;
    	for(int i = 0; i< arr.length; i++) {
    		sum += arr[i];
    		if(min > arr[i]) {
    			min = arr[i];
    		}
    		if(max < arr[i]) {
    			max = arr[i];
    		}    		
    	}    	
    	System.out.printf("%d %d", (sum - max), (sum - min));    	
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
