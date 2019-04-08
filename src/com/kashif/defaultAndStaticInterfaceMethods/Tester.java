package com.kashif.defaultAndStaticInterfaceMethods;



interface Vehicle {
	default void print() {
		System.out.println("I am a vehicle");
	}
	
	static void blowHorn() {
		System.out.println("Blowing horn!");
	}
}

class Car implements Vehicle {
	
}


public class Tester {
	public static void main(String[] args) {
		Car car = new Car();  /* you cannot call a default method with out a concrete class implementing the interface*/
		car.print();
		
		Vehicle.blowHorn();
	}
}
