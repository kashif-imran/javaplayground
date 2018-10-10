package com.kashif.lamdaexpressions;

interface Drawable{  
    public void draw(String shape, int size);  
}  

public class LambdaExpressionExample {  
    public static void main(String[] args) {  
  
        //without lambda, Drawable implementation using anonymous class  
        Drawable d=new Drawable(){  
            public void draw(String shape, int size){
            	System.out.println("Drawing "+shape + " with size " + size);
            }  
        };  
        d.draw("circle", 20); 
        
        Drawable d2 = (shape, size) -> {
        	System.out.println("Drawing2 " + shape + " with size " + size);
        };
        
        d2.draw("square", 30);
    }  
}  