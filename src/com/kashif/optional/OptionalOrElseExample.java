package com.kashif.optional;

import java.util.Optional;

public class OptionalOrElseExample {

    public static void main(String[] args) {
        
        Employee emp = new Employee(1, "kashif");
        Optional<Employee> emloyee = Optional.of(emp);
        System.out.println(emloyee.map(e -> e).orElseGet(() -> new Employee(2, "Imran"))); //<N/A>
        

    }

}

class Employee {
	String name;
	int id;
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println(id + " called");
	}
	
	@Override
	public String toString() {
		return id + " " + name;
	}
}
