package com.kashif.lamdaexpressions;

interface Addable{  
    int add(int a,int b);  
}  
  
public class LambdaExpressionExample6 {  
    public static void main(String[] args) {  
          
        // Lambda expression without return keyword.  
        Addable ad1=(a,b)->(a+b);  
        
        System.out.println(ad1.add(10,20));  
          
        // Lambda expression with return keyword.    
        Addable ad2=(a,b)->{  
                            return (a+b);   
                            };  
        System.out.println(ad2.add(100,200)); 
        
        
        Addable a1 = (a,b) -> (a + b);
        System.out.println(a1.add(100, 300)); 
    }  
}  
