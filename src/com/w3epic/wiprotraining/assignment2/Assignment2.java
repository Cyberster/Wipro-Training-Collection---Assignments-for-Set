/*
Write a program to store a group of employee names into a HashSet, 
retrieve the elements one by one using an Iterator.
 */

package com.w3epic.wiprotraining.assignment2;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Bob");
		set.add("Alice");
		set.add("John");
		set.add("Richard");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
