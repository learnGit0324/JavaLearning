package com.adam.chapter9.genericTest;

import java.util.ArrayList;
import java.util.List;

public class GenericAndArrayTest1 {
	public static void main(String[] args) {
		List<String>[] lsa = new ArrayList[10];
		//将lsa向上转型为Object[]类型的变量
		Object[] oa = lsa;
		List<Integer> li = new ArrayList<>();
		li.add(3);
		oa[1] = li;
		//下面的代码引起类型转换异常
		//java.base/java.lang.Integer cannot be cast to java.base/java.lang.String
//		List<String> arr = lsa[1];
//		String s = lsa[1].get(0);
	}
}
