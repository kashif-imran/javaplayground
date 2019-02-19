package com.kashif.algorithms.sort;

import java.util.Arrays;

class BubbleSort 
{ 
    void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) // we are subtracting i as i'th element goes to the right side/ high side on i'th iteration
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BubbleSort ob = new BubbleSort(); 
        int arr[] = {1, 5, 4, 2, 8 }; 
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        System.out.println(Arrays.toString(arr));
    } 
} 
