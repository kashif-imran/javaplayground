package com.kashif.datastructures.stack;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < 5; i++)
			stack.add(i);
		
		System.out.println("Elements in stack are" + stack);
		stack.pop();
		System.out.println("Elements in stack are" + stack);
	}
}
