package com.kashif.hackerR;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GradingStudents {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        for (int i=0; i < grades.length; i ++) {
            if( grades[i] >= 38) {
                int reminder = grades[i] % 5;
                if (reminder > 2) {
                    int grade = grades[i] - reminder;
                    grades[i] = grade + 5;
                }
            }
            
        }
    	return grades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        System.out.println(Arrays.toString(result));
    }
}

