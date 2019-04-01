package com.adam.chapter9.genericTest;

import java.util.ArrayList;
import java.util.Collection;

public class ErrorTest {
	//����һ�����ͷ��������ͷ�����һ��T�β�
	static <T> void test(Collection<? extends T> from, Collection<T> to) {
		for (T t : from) {
			to.add(t);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Object> ao = new ArrayList<>();
		ArrayList<String> as = new ArrayList<>();
		test(as, ao);
	}
}
