package com.adam.list;

import java.util.LinkedList;

public class ListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("H");
		list.add("I");
		list.add("J");
		System.out.println(list.get(5));
		System.out.println(list.indexOf("E"));
		System.out.println(list.remove(3));
	}
}
