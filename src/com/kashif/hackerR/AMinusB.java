package com.kashif.hackerR;

public class AMinusB { 
    
  // Function for finding elements  
  // which are there in a[] but not 
  // in b[]. 
  static void findMissing(int a[], int b[]) 
  { 
      
      for (int i = 0; i < a.length; i++) 
      { 
          int j; 
            
          for (j = 0; j < b.length; j++) {
              if (a[i] == b[j]) {
                  break; 
              }
          }

          if (j == b.length) 
              System.out.print(a[i] + " "); 
      } 
  } 

  // Driver Code 
  public static void main(String[] args) 
  { 
      int a[] = { 1, 2, 3, 4, 5, 6 }; 
      int b[] = { 1, 2, 3, 7, 8, 9 };
        
      findMissing(a, b); 
  } 
} 
