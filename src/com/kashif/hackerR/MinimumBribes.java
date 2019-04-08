package com.kashif.hackerR;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumBribes {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {    	    	
    	
    	Map<Integer, Integer> bribers = new HashMap<Integer, Integer>();
    	for(int i=0; i < q.length; i ++) {
    		if(q[i] > (i + 1)) {
    			bribers.put(q[i], q[i] - (i + 1));
    		}
    	}
    	
    	int bribes = 0;
    	
    	for (Map.Entry<Integer, Integer> entry : bribers.entrySet()) {
    		if(entry.getValue() > 2) {
    			System.out.println("Too chaotic");
    			return;
    		}
    	    bribes += entry.getValue();
    	}
    	
    	
    	System.out.println(bribes);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}

