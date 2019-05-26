package com.adam.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
	public static void main(String[] args) {
		List books = new ArrayList ();

		books.add(new String("ABC"));
		books.add(new String("BC"));
		books.add(new String("D"));
		
		//使用目标类型为Comparator的Lambda表达式对list集合进行排序
		books.sort((o1,o2) -> (((String)o1).length() - ((String)o2).length()));
		System.out.println(books);
		//
		books.replaceAll(ele -> ((String)ele).length());
		System.out.println(books);
	}
}
