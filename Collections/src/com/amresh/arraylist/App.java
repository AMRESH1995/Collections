package com.amresh.arraylist;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("AMRESH");
		nameList.add("KEERTHI");
		nameList.add("SANGEETHA");
		nameList.add("CHRISTY");
		nameList.add("BASTIN");
		nameList.add("AKHILA");
		nameList.add("VIGNESH");
		
		for(String list:nameList) {
			System.out.println(list);
		}
		
	}			

}
