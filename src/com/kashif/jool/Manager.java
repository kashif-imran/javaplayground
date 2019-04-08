package com.kashif.jool;

import java.util.ArrayList;
import java.util.List;

//import org.jooq.lambda.Seq;

class Employee {
    int id;
    String name;
    
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Manager {
    public static void main(String[] args) {
        
        List<Employee> rows = new ArrayList<>();
        rows.add(new Employee(1, "kashif"));
        rows.add(new Employee(1, "kashif"));
        rows.add(new Employee(1, "a"));
        rows.add(new Employee(1, "b"));
        rows.add(new Employee(1, "c"));
        
        List<Employee> rows2 = new ArrayList<>();
        rows.add(new Employee(1, "imran"));
        rows.add(new Employee(1, "imran"));
        rows.add(new Employee(1, "x"));
        rows.add(new Employee(1, "y"));
        rows.add(new Employee(1, "z"));
        
       // List<String> unique =  Seq.seq(rows).map(r -> r.getName()).distinct().toList();
        
       // System.out.println(unique);
        
    }

}
