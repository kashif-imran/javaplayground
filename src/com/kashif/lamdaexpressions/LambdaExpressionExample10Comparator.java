package com.kashif.lamdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class LambdaExpressionExample10Comparator {
	 public static void main(String[] args) {  
	        List<Product> list=new ArrayList<Product>();  
	          
	        //Adding Products  
	        list.add(new Product(1,"HP Laptop",25000f));  
	        list.add(new Product(3,"Keyboard",300f));  
	        list.add(new Product(2,"Dell Mouse",150f));  
	          
	        System.out.println("Sorting usign Comparator on the basis of name...");  
	        
	        Collections.sort(list, new Comparator<Product>() {

				@Override
				public int compare(Product p1, Product p2) {
					// TODO Auto-generated method stub
					return p1.name.compareTo(p2.name);
				}
	        	
	        });
	        for(Product p:list){  
	            System.out.println(p.id+" "+p.name+" "+p.price);  
	        } 
	  
	        System.out.println("Sorting usign lambda expression  on the basis of id...");  
	        // implementing lambda expression  
			Collections.sort(list, (p1, p2) -> {
				if (p1.id == p2.id) {
					return 0;
				}
				if (p1.id > p2.id) {
					return 1;
				}
				return -1;
			});
	        for(Product p:list){  
	            System.out.println(p.id+" "+p.name+" "+p.price);  
	        }  
	  
	    }  

}
