package com.adam.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	/**
	 * 	LinkedHashSet ��HashSet������
	 * Ԫ�ص�˳�����������˳��һ��
	 */
	public static void main(String[] args) {
		LinkedHashSet<String> books = new LinkedHashSet<String>();
		books.add("Crazy Java");
		books.add("Python Cook Book");
		books.add("Oracle Basic Practices");
		System.out.println(books);
		//ɾ��Crazy Java
		books.remove("Crazy Java");
		//�������Crazy Java
		books.add("Crazy Java");
		System.out.println(books);
	}
}
