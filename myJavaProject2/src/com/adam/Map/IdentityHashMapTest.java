package com.adam.Map;

import java.util.IdentityHashMap;

public class IdentityHashMapTest {
	public static void main(String[] args) {
		/**
		 * ֻ�е�key1==key2������Ϊ����key��ͬ�ģ���������ͨ��Map���ϵ�equals����true��hashCodeֵ���
		 */
		IdentityHashMap ihm = new IdentityHashMap();
		ihm.put(new String("����"), 78);
		ihm.put(new String("��ѧ"), 88);
		ihm.put("Java", 93);
		ihm.put("Java", 98);
		System.out.println(ihm);
	}
}
