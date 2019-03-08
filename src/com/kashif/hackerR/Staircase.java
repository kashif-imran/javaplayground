package com.kashif.hackerR;

import java.util.Scanner;

public class Staircase {	
	
	   // Complete the staircase function below.
    static void staircaseUsingMatrix(int n) {
    	String[][] staircase = new String[n][n];
    	int hashPosition = n- 1;    	
    	for(int i=0; i < n; i ++) {    	
    		for(int j=0; j < n; j ++) {
    			if(j >= hashPosition) {
    				staircase[i][j] = "#";
    				--hashPosition;
    			} else {
    				staircase[i][j] = " ";
    			}
    		}
    	}
    	printMatrix(staircase);

    }

	private static void printMatrix(String[][] staircase) {
		for(int i = 0; i < staircase.length; i ++) {
    		for(int j=0; j < staircase.length; j ++) {
    			System.out.print(staircase[i][j]);
    		}
    		System.out.println();
    	}
	}
    
   /* 
    00 01 02
    10 11 12
    20 21 22
    */
	private static void stairCaseStringBuilder(int n) {
		StringBuilder builder = new StringBuilder();
	    for (int i = 0; i <n ; i++) 
	        builder.append(" ");
	    int j = 0;

	    for (int i = 1; i <=n; i++) {
	        builder.replace(builder.length()-i,          
	        builder.length() - j, "#");
	        System.out.println(builder);
	        j++;
	    }
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Enter the size of staircase");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //staircaseUsingMatrix(n);
        //stairCaseStringBuilder(n);
        stairCasePrintf(n);

        scanner.close();
    }

	private static void stairCasePrintf(int n) {
		String str="#";
	    for (int i=0;i<n;i++)
	        { 
	        System.out.printf("%"+n+"s%n",str);
	        str=str+"#";
	    }
		
	}
}