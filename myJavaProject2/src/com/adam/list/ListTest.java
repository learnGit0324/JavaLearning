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
		//�����ַ�������ڶ���λ��
		books.add(1, new String("and"));
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		//ɾ���ڶ���Ԫ��
		books.remove(1);
		System.out.println(books);
		//�ж�ָ��Ԫ���ڼ����е�λ��
		System.out.println(books.indexOf(new String("FJ")));
		//���ڶ���Ԫ���滻Ϊ�µ��ַ�������
		books.set(1, new String("Yan"));
		System.out.println(books);
		//ȡ�������еĲ���Ԫ��, �ӽ������[,) ����ǰ�����󲻰������Ӽ���
		System.out.println(books.subList(1, 2));
		
	}
}
