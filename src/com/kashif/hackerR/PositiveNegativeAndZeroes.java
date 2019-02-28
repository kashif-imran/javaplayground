package com.kashif.hackerR;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PositiveNegativeAndZeroes {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
         double  numberOfPositiveNumbers = (double)Arrays.stream(arr).filter(i -> i > 0).count() / arr.length;
         double numberOfNegativeNumbers = (double)Arrays.stream(arr).filter(i -> i < 0).count() / arr.length;
        double numberOfZeroes = (double)Arrays.stream(arr).filter(i -> i == 0).count()/ arr.length;
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(numberOfPositiveNumbers));
        System.out.println(df.format(numberOfNegativeNumbers));
        System.out.println(df.format(numberOfZeroes));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
