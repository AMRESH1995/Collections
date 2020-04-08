package com.amresh.arraylist;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedBlockingQueue<Integer>();   // we can add as many elements as possible
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		queue.add(7);
		
		for(Integer i : queue) {
			System.out.println(i);
		}
		
		Queue<String> names = new ArrayBlockingQueue<String>(5); // we need to provide the size of queue in case of ArrayBlockingQueue
		try {
			names.add("AMRESH");                                     // Here it will fail because 7 elements are added 
			names.add("KEERU");
			names.add("CHRISTY");
			names.add("ARUN");
			names.add("SAMU");
			names.add("BASTIN");
			names.add("AKHILA");
		} catch (Exception e) {
			
			System.out.println("Queue is full");
		}
		
		

	}

}
