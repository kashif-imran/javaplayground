package com.kashif.encryption;

public class MaskingTest {
	private static String maskStringBySequence(String input, String mask) {
        if (input.length() < mask.length() - 1) {
            mask = "-##";
        }
        StringBuilder maskedNumber = new StringBuilder();
        if (mask.startsWith("-")) {
            int midIndex = input.length() - (mask.length() - 1);
            maskedNumber.append(input.substring(0, midIndex).replaceAll(".", "*"));
            maskedNumber.append(input.substring(midIndex));
        } else {
            maskedNumber.append(input.substring(0, mask.length() - 1));
            maskedNumber.append(input.substring(mask.length() - 1).replaceAll(".", "*"));
        }
        return maskedNumber.toString();
    }
public static void main(String[] args) {
	System.out.println(maskStringBySequence("12345", "-##"));
	
}
}
