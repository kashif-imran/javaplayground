package com.kashif.lamdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product1{  
    int id;  
    String name;  
    float price;  
    public Product1(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class LambdaExpressionExample11FilterCollectionData {
	public static void main(String[] args) {  
        List<Product> list=new ArrayList<Product>();  
        list.add(new Product(1,"Samsung A5",17000f));  
        list.add(new Product(3,"Iphone 6S",65000f));  
        list.add(new Product(2,"Sony Xperia",25000f));  
        list.add(new Product(4,"Nokia Lumia",15000f));  
        list.add(new Product(5,"Redmi4 ",26000f));  
        list.add(new Product(6,"Lenevo Vibe",19000f));  
          
        // using lambda to filter data  
        Stream<Product> filtered_data = list.stream().filter(x -> x.price > 20000);  
          
        // using lambda to iterate through collection  
        System.out.println("------------------------------");
        System.out.println("Products where price > 20000");
        System.out.println("------------------------------");
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        );  
        System.out.println("------------------------------");
        System.out.println("Products where price < 20000");
        System.out.println("------------------------------");
        Stream<Product> filtered_data1 = list.stream().filter(p -> p.price < 20000);
        filtered_data1.forEach(
        		product -> System.out.println(product.name + " : " + product.price )
        		);
        
    }  

}
