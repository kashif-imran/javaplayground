package com.kashif.dynammicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Arrays.toString(fibonacci(n)));
		
	}

	private static int[] fibonacci(int n) {
		int[] fib = new int[n + 1];
		
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib;
	}
}
