package com.adam.chapter9.genericTest;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethodTest {
	//����һ�����ͷ������÷��ͷ����д�һ��T�����β�
	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
		for (T t : a) {
			c.add(t);
		}
	}
	
	public static void main(String[] args) {
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<>();
		//��������е�T����Object����
		fromArrayToCollection(oa, co);
		
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<>();
		//���������T����String����
		fromArrayToCollection(sa, cs);
		
		//��������е�T����Object����
		fromArrayToCollection(sa, co);
		
		Integer[] ia = new Integer[100];
		Float[] fa = new Float[100];
		Number[] na = new Number[100];
		Collection<Number> cn = new ArrayList<>();
		//��������е�T����Number����
		fromArrayToCollection(ia, cn);
		//��������е�T����Number����
		fromArrayToCollection(fa, cn);
		//��������е�T����Number����
		fromArrayToCollection(na, cn);
		//��������е�T����Object����
		fromArrayToCollection(na, co);
		//��������е�T����String���ͣ� ����na��һ��Number���飬��ΪNumber�Ȳ���String���ͣ�Ҳ�����������࣬���Ա������
//		fromArrayToCollection(na, cs);
	}
}
