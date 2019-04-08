package com.kashif.hackerR;

import java.util.Scanner;

public class MakingAnagramsUsingAscii {
	public static int numberNeeded(String first, String second) {
		int[] lettercounts = new int[26];
		for(char c : first.toCharArray()){
			lettercounts[c-'a']++;
		}
		for(char c : second.toCharArray()){
			lettercounts[c-'a']--;
		}
		
		//logic: if the char is present in both arrays then the value at the position of the alphabet will be 0 else it will be other values +ve or -ve 
		int result = 0;
		for(int i : lettercounts){
			result += Math.abs(i);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}
