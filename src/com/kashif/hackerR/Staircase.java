package com.kashif.hackerR;

import java.util.Scanner;

public class Staircase {
	   // Complete the staircase function below.
    static void staircase(int n) {
    	StringBuilder hashes = new StringBuilder();
    	for (int i=0; i < n; i ++) {
    		hashes.append(" ");
    	}
		for(int i = 0; i < n; i++) {
    		hashes.replace(n - (i + 1), n - i, "#");
			System.out.println(hashes);
    	}
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