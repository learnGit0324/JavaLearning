package com.adam.chapter9.genericTest;

import java.util.ArrayList;
import java.util.List;

public class GenericAndArrayTest1 {
	public static void main(String[] args) {
		List<String>[] lsa = new ArrayList[10];
		//��lsa����ת��ΪObject[]���͵ı���
		Object[] oa = lsa;
		List<Integer> li = new ArrayList<>();
		li.add(3);
		oa[1] = li;
		//����Ĵ�����������ת���쳣
		//java.base/java.lang.Integer cannot be cast to java.base/java.lang.String
//		List<String> arr = lsa[1];
//		String s = lsa[1].get(0);
	}
}
