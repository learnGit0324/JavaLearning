package com.adam.chapter9.genericTest;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		// Comparator��ʵ��������TreeSet��Ԫ�����ͣ� �������丸�࣬��������
		TreeSet<String> ts1 = new TreeSet<>(new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				return hashCode() > o2.hashCode() ? 1 : hashCode() < o2.hashCode() ? -1 : 0;
			}
		});

		ts1.add("hello");
		ts1.add("wa");

		TreeSet<String> ts2 = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length() > o2.length() ? -1 : o1.length() < o2.length() ? 1 : 0;
			}
		});

		ts2.add("hello");
		ts2.add("wa");

		System.out.println(ts1);
		System.out.println(ts2);
	}
}
