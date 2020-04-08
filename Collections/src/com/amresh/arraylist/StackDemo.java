package com.amresh.arraylist;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> books = new Stack<String>();
		books.push("Playing it my Way");
		books.push("Mind Masters");
		books.push("Wings of Fire");
		books.push("Java Complete Reference");
		books.push("Theory of Machines");
		books.push("Thermodynamics");
		books.push("Machine Design");

		for (String stackList : books) {
			System.out.println(stackList);
		}
		
		System.out.println("********************************************************************************************************");
		System.out.println(books.pop());
		System.out.println(books.peek());
		System.out.println(books.search("Java Complete Reference"));
		System.out.println(books.empty());
		
		
	}

}
