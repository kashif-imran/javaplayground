package com.kashif.algorithms.sort;

import java.util.Arrays;

public class SelectionSort {

	public static int[] sort(int[] a) {
		for(int i=0; i < a.length - 1; i++) {
			System.out.println(String.format(" i %d", i));
			int min = i;
			for(int j = i + 1; j < a.length; j ++) {
				System.out.println(String.format(" j %d", j));
				if(a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		return a;

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sort(new int[] { 5, 4, 1, 6, 7, 2 })));
	}

}
