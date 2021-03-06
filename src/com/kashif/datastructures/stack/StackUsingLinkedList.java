package com.kashif.datastructures.stack;

class LinkList<T> {

    private static class Node<T> {

        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node<T> first = null;

    public void addFirst(T data) {
        Node<T> newFirst = new Node<T>(data);
        newFirst.next = first;
        first = newFirst;
    }

    public T removeFirst() {
        Node<T> oldFirst = first;
        first = first.next;
        return oldFirst.data;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node current = first;
        while (current != null) {
            builder.append(current).append(" ");
            current = current.next;
        }
        return builder.toString();
    }

    public boolean isEmpty() {
        return first == null;
    }

}

class LinkListStack<T> {

    private final LinkList<T> linkedList = new LinkList<>();

    public void push(T data) {
        linkedList.addFirst(data);
    }

    public T pop() {
        return linkedList.removeFirst();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}

public class StackUsingLinkedList {
	public static void main(String[] args) {
		
		LinkListStack<Integer> stack = new LinkListStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack);
		
		
	}
}