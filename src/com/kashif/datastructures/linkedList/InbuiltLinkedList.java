package com.kashif.datastructures.linkedList;

import java.util.LinkedList;

public class InbuiltLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		System.out.println(list);
		list.remove();
		System.out.println(list);
		list.add(3);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.add(3);
		list.add(4);
		list.add(5);
		list.removeLast();
	}

}
