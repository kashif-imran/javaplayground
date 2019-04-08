package com.kashif.hackerR;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MakingAnagrams {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
    	String[] aArray = a.split("");
    	String[] bArrray = b.split("");
    	
    	for(int i=0; i< aArray.length; i++) {
    		for(int j=0; j< bArrray.length; j++) {
    			if(aArray[i].equals(bArrray[j])) {
    				aArray[i] = "$";
    				bArrray[j] = "$";
    			}
    		}
    	}   	
    	
    	return (int)Arrays.stream(aArray).filter(e -> !e.equals("$")).count() + (int)Arrays.stream(bArrray).filter(e -> !e.equals("$")).count();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String a = "abcad";

        String b = "abce";

        int res = makeAnagram(a, b);      

        scanner.close();
        
        System.out.println(res);
    }
}
