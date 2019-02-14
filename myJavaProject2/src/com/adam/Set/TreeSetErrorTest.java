package com.adam.Set;

import java.util.TreeSet;

public class TreeSetErrorTest {
	public static void main(String[] args) {
		//if the new Err object doesn't implements, it will has exception
		//com.adam.Set.Err cannot be cast to java.base/java.lang.Comparable

		TreeSet ts = new TreeSet();
		//add two Err object
		ts.add(new Err().a);
		//different type objects, can't do comparing 
		ts.add(new String("Java"));
		System.out.println(ts);
	}
}
class Err<T> implements Comparable<T>{
	int a = 10;
	public Err(){
		
	}

	@Override
	public int compareTo(T o) {
		return 0;
	}
}
