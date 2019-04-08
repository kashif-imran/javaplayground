package com.kashif.functions;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Employee {
	String name;
	int age;

	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Function1 {
	public static void main(String[] args) {
		// single arg functions
		 /* First arg of function is input type and second arguent is result type */
		Function<Integer, Integer> add1 = x -> x + 1;
		Function<String, String> concat = x -> x + 1;
		System.out.println(add1.apply(2));
		System.out.println(concat.apply("kashif"));

		/*2 arg function ie., takes 2 args and returns a value */
		
		BiFunction<String, String, String> bi = (x, y) -> {
			return x + y;
		};

		System.out.println(bi.apply("Kashif ", "  Imran"));

		/*takes 2 input but does not return any result */
		BiConsumer<Integer, Integer> printSum = (x, y) -> System.out
				.println(String.format("Sum of x & y is %d", x + y));
		printSum.accept(5, 12);
		
		
		/* represents an operation upon two operands of the same type, producing a result of the same type.*/
		BinaryOperator<Integer> adder = (n1, n2) -> n1 + n2;
		System.out.println(adder.apply(12, 2));
		
		Predicate<Integer> positiveNumber = n -> n > 0;
		print(positiveNumber.test(-5));
		
		BiPredicate<Integer, Integer> greaterThan = (n1, n2) -> n1 > n1;
		print(greaterThan.test(2, 4));
		
		/*
		 * The lambda expression assigned to an object of Supplier type is used
		 * to define its get() which eventually produces a value. Suppliers are
		 * useful when we don’t need to supply any value and obtain a result at
		 * the same time.
		 */
		Supplier<Double> randomValue = () -> Math.random();
		print(randomValue.get());
		
		

	}
	
	static void print(Object input) {
		System.out.println(input);
	}
}
