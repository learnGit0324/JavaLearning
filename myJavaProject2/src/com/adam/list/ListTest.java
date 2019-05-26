package com.adam.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
		
		List<String> books = new ArrayList<>();
		books.add(new String("Adam"));
		books.add(new String("Yanzi"));
		books.add(new String("FJ"));
		System.out.println(books);
		//将新字符串插入第二个位置
		books.add(1, new String("and"));
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		//删除第二个元素
		books.remove(1);
		System.out.println(books);
		//判定指定元素在集合中的位置
		System.out.println(books.indexOf(new String("FJ")));
		//将第二个元素替换为新的字符串对象
		books.set(1, new String("Yan"));
		System.out.println(books);
		//取出集合中的部分元素, 从结果来看[,) 属于前包扩后不包扩的子集合
		System.out.println(books.subList(1, 2));
		
	}
}
