package com.adam.Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;

import org.junit.Test;

public class IteratorTest {
	/**
	 * ���������ʾ iterator�������ṩʢװ���������
	 */
	@Test
	public void iteratorTest1() {
		//��������
		Collection books = new HashSet();
		books.add("Java");
		books.add("Python");
		books.add("Android");
		//��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
		while(it.hasNext()) {
			//it.next()���ص�����������object���ͣ� �����Ҫ��������ת��
			String book = (String) it.next();
			System.out.println(book);
			if (book.equals("Andriod")) {
				it.remove();
			}
			//��book������ֵ ����ı伯��Ԫ�ر���
			book = "C++";
		}
		System.out.println(books);
	}
	/**
	 * �ڼ��ϱ��������� ��Ҫ���м���Ԫ�ص����ɾ���Ȳ���
	 */
	@Test
	public void iteratorTest2() {
		Collection books = new HashSet();
		books.add("Java");
		books.add("Python");
		books.add("Android");
		//��ȡbooks���϶�Ӧ�ĵ�����
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
		//����һ������
		Collection books = new HashSet();
		books.add("Crazy Java");
		books.add("Python");
		books.add("Android");
		books.add("Python Coook book");
		//ʹ��Lambda���ʽ��Ŀ��������Predicate�����˼���
		books.removeIf(ele -> ((String)ele).length() < 10);
		System.out.println(books);
	}
	@Test
	public void predicateTest2() {
		//����һ������
		Collection books = new HashSet();
		books.add("Crazy Java");
		books.add("Python");
		books.add("Android");
		books.add("Python Coook book");
		//ͳ����������������Ӵ���ͼ������
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
