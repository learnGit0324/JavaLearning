package com.adam.Collection;

import java.util.Collection;
import java.util.HashSet;

import org.junit.Test;

public class LambdaTest {
	@Test
	public void collectionEachTest1() {
		Collection<String> books = new HashSet<>();
		books.add("Java");
		books.add("Python");
		books.add("Android");
		//调用forEach()方法遍历集合
		books.forEach(obj -> System.out.println("迭代集合元素："+obj));
	}
}
