package com.adam.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap scores = new LinkedHashMap();
		scores.put("����", 80);
		scores.put("��ѧ", 85);
		scores.put("Ӣ��", 85);
		//LinkedHashMap���Լ�סkey-value�����˳��
		scores.forEach((key, value) -> System.out.println(key+"-"+value));
	}
}
