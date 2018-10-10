package com.kashif.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

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
        Function<Integer,Integer> add1 = x -> x + 1; // First arg of function is input type and second arguent is result type
        Function<String,String> concat = x -> x + 1;
        
        System.out.println(add1.apply(2));
        System.out.println(concat.apply("kashif"));
        
        BiFunction<String, String,String> bi = (x, y) -> {      
            return x + y;
          };

          System.out.println(bi.apply("Kashif ", "  Imran"));
    }
}
