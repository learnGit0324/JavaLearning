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
		//����forEach()������������
		books.forEach(obj -> System.out.println("��������Ԫ�أ�"+obj));
	}
}
