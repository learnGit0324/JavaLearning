package com.adam.chapter9.genericTest;

import java.util.ArrayList;
import java.util.List;

public class GenericAndArrayTest2 {
	public static void main(String[] args) {
		//java�����������޵�ͨ����������飬 ����new ArrayList<?>[10] ʹ�ó��򲻵ò�����ǿ������ת��
		List<?>[] lsa = new ArrayList<?>[10];
		//��lsa����ת��ΪObject[]���͵ı���
		Object[] oa = lsa;
		List<Integer> li = new ArrayList<>();
		li.add(3);
		oa[1] = li;
		Object target = lsa[1].get(0);
		
		if (target instanceof String) {
			//����Ĵ��밲ȫ
			String s = (String) target;
			System.out.println(s);
		}
	}
}
