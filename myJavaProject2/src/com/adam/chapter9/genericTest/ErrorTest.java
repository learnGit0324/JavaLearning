package com.adam.chapter9.genericTest;

import java.util.ArrayList;
import java.util.Collection;

public class ErrorTest {
	//声明一个泛型方法，泛型方法带一个T形参
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
