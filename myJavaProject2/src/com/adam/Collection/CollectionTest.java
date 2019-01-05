package com.adam.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.junit.Test;

public class CollectionTest {
	
	@Test
	public void collectionTest1() {
		Collection c = new ArrayList<>();
		//add elements 
		c.add("Adam");
		//虽热集合里面不能放基本类型的值，但是Java支持自动封装
		c.add(6);
		System.out.println("集合c的元素个数为： "+c.size());
		//删除制定元素
		c.remove(6);
		System.out.println("集合c的元素个数为： "+c.size());
		//判断是否包含制定字符串
		System.out.println("c集合是否包含\"Adam\"字符串: "+c.contains("Adam") );
		c.add("Java");
		System.out.println("c集合的元素："+c);
		
		Collection books = new HashSet();
		books.add("Java");
		books.add("Python");
		System.out.println("c集合是否包含books："+c.containsAll(books));
		c.removeAll(books); //用c集合减去books里的元素
		System.out.println("c集合的元素："+c);
		//删除c中的所有元素
		c.clear();
		System.out.println("c集合的元素："+c);
		books.retainAll(c); //控制books集合里只剩下c集合里也包含的元素
		System.out.println("books集合的元素： "+books);
	}
	
	
}
