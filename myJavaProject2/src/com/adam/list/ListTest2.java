package com.adam.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		List<String> books = new ArrayList<>();
		books.add(new String("A"));
		books.add(new String("B"));
		books.add(new String("C"));
		
		System.out.println(books);
		//删除集合中的A对象， 导致集合中的第一个元素被移除
		books.remove(new A()); 
		System.out.println(books);
		//删除集合中的A对象， 导致集合中的第一个元素被移除
		books.remove(new A());
		System.out.println(books);
		//每次移除A对象，都使结合中的第一个元素被移除是因为集合元素的equals方法总是返回true
	}
}
