package com.kashif.hackerR;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	
    	int arrayLength = a.length;
		if(arrayLength > d && arrayLength % d == 0) {
    		return a;
    	}
    	int lastIndex = arrayLength - 1;
    	while(d > 0) {
    		rotateArray(a, lastIndex);
    		d--;
    	}
    	
    	return a;

    }

	private static void rotateArray(int[] a, int lastIndex) {
		for(int i=0; i< lastIndex; i++) {
    		int temp = a[i];
    		a[i] = a[i + 1];
    		a[i + 1] = temp;
    	}
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        System.out.println(Arrays.toString(result));

        scanner.close();
    }
}

