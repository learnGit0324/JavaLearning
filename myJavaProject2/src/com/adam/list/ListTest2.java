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
		//ɾ�������е�A���� ���¼����еĵ�һ��Ԫ�ر��Ƴ�
		books.remove(new A()); 
		System.out.println(books);
		//ɾ�������е�A���� ���¼����еĵ�һ��Ԫ�ر��Ƴ�
		books.remove(new A());
		System.out.println(books);
		//ÿ���Ƴ�A���󣬶�ʹ����еĵ�һ��Ԫ�ر��Ƴ�����Ϊ����Ԫ�ص�equals�������Ƿ���true
	}
}
