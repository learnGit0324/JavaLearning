package com.adam.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	public static void main(String[] args) {
	    /**
	     * Constructs an empty insertion-ordered {@code LinkedHashMap} instance
	     * with the default initial capacity (16) and load factor (0.75).
	     */
		//����һ�����������ʵ��
		LinkedHashMap<String, Integer> scores = new LinkedHashMap<>();
		scores.put("����", 80);
		scores.put("��ѧ", 85);
		scores.put("Ӣ��", 85);
		//LinkedHashMap���Լ�סkey-value�����˳��
		scores.forEach((key, value) -> System.out.println(key+"-"+value));
	}
}
