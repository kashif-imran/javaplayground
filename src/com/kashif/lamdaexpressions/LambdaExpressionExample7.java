package com.kashif.lamdaexpressions;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface  
interface Sayable{  
    String say(String message);  
}  

public class LambdaExpressionExample7 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("ankit");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");

		list.forEach((x) -> System.out.println(x));
		
		Sayable s = (m) -> {
			String s1 = "Hello ";
			return (s1 + m);
		};
		
		System.out.println(s.say("Kashif"));
	}
}
