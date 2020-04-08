package com.amresh.arraylist;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();      //TreeSet will sort the elements
		set.add("AMRESH");
		set.add("KEERU");
		set.add("CHRISTY");
		set.add("SAMU");
		set.add("BASTIN");
		set.add("AKHILA");
		set.add("AMRESH");

		for (String name : set) {
			System.out.println(name);
		}
		
		System.out.println("**********************************************************************************");

		Set<Integer> list = new HashSet<Integer>();   //HashSet wont guarantee any order
		for (int i = 10; i > 0; i--) {
			list.add(i);
		}
		
		for(int i : list) {
			System.out.println(i);
		}
		
		System.out.println("##################################################################################");
		
		
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();   //LinkedHashSet keeps the elements in the order in which they are added
		for (int i = 10; i > 0; i--) {
			linkedHashSet.add(i);
		}
		
		for(int i : linkedHashSet) {
			System.out.println(i);
		}
		
		System.out.println("##################################################################################");
		
	}

}
