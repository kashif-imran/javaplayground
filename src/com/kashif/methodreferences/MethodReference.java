package com.kashif.methodreferences;

@FunctionalInterface
interface Sayable{  
    void say();  
}  
public class MethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {
    	
    	MethodReference.saySomething();
    	
        // Referring static method  
        Sayable sayable = MethodReference::saySomething;  
        // Calling interface method  
        sayable.say();  
        
        Sayable say2 = MethodReference::saySomething;
        say2.say();
    }  
}  
