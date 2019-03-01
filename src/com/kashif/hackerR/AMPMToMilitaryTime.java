package com.kashif.hackerR;

import java.io.IOException;
import java.util.Scanner;

public class AMPMToMilitaryTime {
	static String timeConversion(String s) {
        return null;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scan.nextLine(); //07:05:45PM

        String result = timeConversion(s);

        System.out.println(result);
    }
}
