package com.adam.chapter9;

import java.util.ArrayList;

public class ArrayErr {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		test(strList);
		
		Integer[] ia = new Integer[5];
		Number[] na = ia;
		//������������������������ʱ����java.lang.ArrayStoreException�쳣�쳣
		//��Ϊ0.5������Integer
		na[0] = 0.5;
		//Java���ԭ��ֻҪ�����ڱ���ʱû�г��־��棬�Ͳ�������ʱ����ClassCastException
	}

	private static void test(ArrayList<String> strList) {
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
}
