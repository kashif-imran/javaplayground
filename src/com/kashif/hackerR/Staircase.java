package com.kashif.hackerR;

import java.util.Arrays;
import java.util.Scanner;

public class Staircase {
	   // Complete the staircase function below.
    static void staircase(int n) {
    	String [][] staircase = new String[n][n];
    	for(int i=0; i < n; i ++) {
    		for(int j=0; j < n; j ++) {
    			if(j == n - i)
    			staircase[i][j] = " ";
    		}
    	}
    	System.out.println(Arrays.deepToString(staircase));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Enter the size of staircase");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}