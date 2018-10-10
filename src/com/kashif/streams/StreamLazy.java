package com.kashif.streams;

import java.util.stream.Stream;

public class StreamLazy {
	public static void main(String[] args) {
		
		 /*Terminal operations produces a non-stream, result such as primitive value, a collection or no value at all. 
		 Terminal operations are typically preceded by intermediate operations which return another Stream which allows operations to be connected in a form of a query.*/
		
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return true;
	    }); // No o/p because no terminal operation
		
		System.out.println("---------------------------------------");
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return true;
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
		System.out.println("---------------------------------------");
		/*
		The order of the result might be surprising. A naive approach would be to execute the operations horizontally one after another on all elements of the stream. 
		But instead each element moves along the chain vertically. The first string "d2" passes filter then forEach, only then the second string "a2" is processed.

		This behavior can reduce the actual number of operations performed on each element, as we see in the next example:
		*/
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .anyMatch(s -> {
	        System.out.println("anyMatch: " + s);
	        return s.startsWith("A");
	    });
		/*The operation anyMatch returns true as soon as the predicate applies to the given input element. This is true for the second element passed "A2". 
		Due to the vertical execution of the stream chain, map has only to be executed twice in this case. So instead of mapping all elements of the stream, map will be called as few as possible.

		Why order matters

		The next example consists of two intermediate operations map and filter and the terminal operation forEach. Let's once again inspect how those operations are being executed:
		 */	
		System.out.println("---------------------------------------");
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("A");
	    })
	    .forEach(s -> System.out.println("forEach: " + s));

		/* map:     d2
		 filter:  D2
		 map:     a2
		 filter:  A2
		 forEach: A2
		 map:     b1
		 filter:  B1
		 map:     b3
		 filter:  B3
		 map:     c
		 filter:  C
		
		As you might have guessed both map and filter are called five times for every string in the underlying collection whereas forEach is only called once.

		We can greatly reduce the actual number of executions if we change the order of the operations, moving filter to the beginning of the chain:*/
		System.out.println("---------------------------------------");
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("a");
	    })
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .forEach(s -> System.out.println("forEach: " + s));

		/* filter:  d2
		 filter:  a2
		 map:     a2
		 forEach: A2
		 filter:  b1
		 filter:  b3
		 filter:  c
		 
		 Now, map is only called once so the operation pipeline performs much faster for larger numbers of input elements. Keep that in mind when composing complex method chains.

		Let's extend the above example by an additional operation, sorted:
		 
		 */
		System.out.println("---------------------------------------");
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .sorted((s1, s2) -> {
	        System.out.printf("sort: %s; %s\n", s1, s2);
	        return s1.compareTo(s2);
	    })
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("a");
	    })
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
		
		
		
		
	}

}
