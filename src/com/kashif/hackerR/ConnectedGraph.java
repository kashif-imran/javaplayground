package com.kashif.hackerR;

import java.util.Scanner;

public class ConnectedGraph {

    
    private static int rows; // here for convenience
    private static int cols; // here for convenience
    
    public static void main(String[] args) {
        /* Read and save grid */
        Scanner scan = new Scanner(System.in);
        rows = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        cols = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int grid[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
        	String[] arItems = scan.nextLine().split(" ");
        	scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < cols; j++) {
                String item = arItems[j];
				grid[i][j] = Integer.parseInt(item);
            }
        }
        scan.close();

        System.out.println(largestRegion(grid));
    }
    
    /* Returns the size of the largest region */
    public static int largestRegion(int [][] grid) {
        int maxRegion = 0;
        
        /* From each filled cell, find the largest region from that cell */
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 1) {
                    int size = findLargestRegion(grid, row, col);
                    maxRegion = Math.max(maxRegion, size);
                }
            }
        }
        return maxRegion;
    }
    
    private static int findLargestRegion(int [][] grid, int row, int col) {
        /* Pro tip: put boundary checks at top of recursive call, 
                    instead of before doing recursive call */
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            return 0;
        } else if (grid[row][col] == 0) {
            return 0;
        }

        grid[row][col] = 0; // we alter the original matrix here
        int size = 1;       // 1 accounts for our size
        
        /* Accounts recursively for neighbors sizes */
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
            	System.out.println(String.format("findLargestRegion(%d, %d)", r, c));
                int largestRegion = findLargestRegion(grid, r, c);
            	//System.out.println(String.format("largestRegion is %d", largestRegion));
				size += largestRegion;
				//System.out.println(String.format("size is %d", size));
				//System.out.println();
            }
        }

        return size;
    }
}
