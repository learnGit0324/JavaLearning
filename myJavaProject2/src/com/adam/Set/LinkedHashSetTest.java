package com.adam.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	/**
	 * 	LinkedHashSet 是HashSet的子类
	 * 元素的顺序总是与添加顺序一致
	 */
	public static void main(String[] args) {
		LinkedHashSet<String> books = new LinkedHashSet<String>();
		books.add("Crazy Java");
		books.add("Python Cook Book");
		books.add("Oracle Basic Practices");
		System.out.println(books);
		//删除Crazy Java
		books.remove("Crazy Java");
		//重新添加Crazy Java
		books.add("Crazy Java");
		System.out.println(books);
	}
}
