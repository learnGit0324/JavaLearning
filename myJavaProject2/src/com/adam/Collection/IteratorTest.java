package com.adam.Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;

import org.junit.Test;

public class IteratorTest {
	/**
	 * 遍历结果显示 iterator本身并不提供盛装对象的能力
	 */
	@Test
	public void iteratorTest1() {
		//创建集合
		Collection books = new HashSet();
		books.add("Java");
		books.add("Python");
		books.add("Android");
		//获取books集合对应的迭代器
		Iterator it = books.iterator();
		while(it.hasNext()) {
			//it.next()返回的数据类型是object类型， 因此需要进行类型转换
			String book = (String) it.next();
			System.out.println(book);
			if (book.equals("Andriod")) {
				it.remove();
			}
			//对book变量赋值 不会改变集合元素本身
			book = "C++";
		}
		System.out.println(books);
	}
	/**
	 * 在集合遍历过程中 不要进行集合元素的添加删除等操作
	 */
	@Test
	public void iteratorTest2() {
		Collection books = new HashSet();
		books.add("Java");
		books.add("Python");
		books.add("Android");
		//获取books集合对应的迭代器
		Iterator it = books.iterator();
		while(it.hasNext()) {
			String book = (String) it.next();
			System.out.println(book);
			if (book.equals("Android")) {
				books.remove(book);
			}
		}
	}
	@Test
	public void predicateTest() {
		//创建一个集合
		Collection books = new HashSet();
		books.add("Crazy Java");
		books.add("Python");
		books.add("Android");
		books.add("Python Coook book");
		//使用Lambda表达式（目标类型是Predicate）过滤集合
		books.removeIf(ele -> ((String)ele).length() < 10);
		System.out.println(books);
	}
	@Test
	public void predicateTest2() {
		//创建一个集合
		Collection books = new HashSet();
		books.add("Crazy Java");
		books.add("Python");
		books.add("Android");
		books.add("Python Coook book");
		//统计书名包含“疯狂”子串的图书数量
		System.out.println(calAll(books, ele->((String)ele).contains("Crazy")));
		System.out.println(calAll(books, ele->((String)ele).contains("Java")));
		System.out.println(calAll(books, ele->((String)ele).length()>10));
	}
	public static int calAll(Collection books, Predicate p) {
		int total = 0;
		for (Object object : books) {
			if (p.test(object)) {
				total++;
			}
		}
		return total;
	}
}
