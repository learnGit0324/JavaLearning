package com.adam.Set;

import java.util.HashSet;

import org.junit.Test;

public class HashSetTest {
	
	/**
	 * Set������һ������ļ��� ���������ظ���Ԫ��
	 * HashSet
	 * TreeSet
	 * EnumSet
	 */
	
	/*
	 * HashSet��
	 * ���ܱ�֤Ԫ�ص�����˳��
	 * HashSet����ͬ���� ���̷߳���ʱ���뿼��ͬ������
	 * ����Ԫ�ؿ���ʹnull
	 * 
	 * �Ƚ�HashSet����Ԫ����ȣ�
	 * ��������ͨ��equals()�����Ƚ����
	 * �������������hashCode()��������ֵҲ���
	 */
	@Test
	public void hashSetTest1() {
		HashSet books = new HashSet();
		/**
		 * �ӷ��ؽ������ C����д��equals()��hashCode()������ ʹ��HashSet������C���󵱳�ͬһ������
		 * 
		 */
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		System.out.println(books);
	}

	
	
}

class A {
	public boolean equals(Object obj) {
		return true;
	}
}

class B {
	public int hashCode() {
		return 1;
	}
}

class C {
	public int hashCode() {
		return 2;
	}
	public boolean equals(Object obj) {
		return true;	
	}
}