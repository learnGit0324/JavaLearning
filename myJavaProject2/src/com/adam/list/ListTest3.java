package com.adam.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
	public static void main(String[] args) {
		List books = new ArrayList ();

		books.add(new String("ABC"));
		books.add(new String("BC"));
		books.add(new String("D"));
		
		//ʹ��Ŀ������ΪComparator��Lambda���ʽ��list���Ͻ�������
		books.sort((o1,o2) -> (((String)o1).length() - ((String)o2).length()));
		System.out.println(books);
		//
		books.replaceAll(ele -> ((String)ele).length());
		System.out.println(books);
	}
}
