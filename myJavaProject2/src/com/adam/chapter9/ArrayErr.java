package com.adam.chapter9;

import java.util.ArrayList;

public class ArrayErr {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		test(strList);
		
		Integer[] ia = new Integer[5];
		Number[] na = ia;
		//下面代码编译正常，但是运行时引发java.lang.ArrayStoreException异常异常
		//因为0.5并不是Integer
		na[0] = 0.5;
		//Java设计原则：只要代码在编译时没有出现警告，就不会运行时遇到ClassCastException
	}

	private static void test(ArrayList<String> strList) {
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
}
