package com.amresh.arraylist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedListDemo obj = new LinkedListDemo();
		LinkedList<String> countries = new LinkedList<String>();
		countries.add("INDIA");
		countries.add("USA");
		countries.add("LONDON");
		countries.add("PARIS");
		countries.add("AUSTRALIA");
		countries.add("SPAIN");
		countries.add("RUSSIA");
		countries.add("JAPAN");
		obj.printList(countries);
		
		countries.add(2, "SWITZERLAND");   // adding a new node
		obj.printList(countries);
		
		countries.set(6, "SWEDAN");     // modify the content
		obj.printList(countries);
		
		countries.remove(); // this will remove first element
		countries.remove(5); // this will remove element at index 5

	}
	
	public void printList(LinkedList<String> list) {
		for(String element : list) {
			System.out.println("Element :" +element);
		}
		System.out.println("*********************************************************************");
	}

}
