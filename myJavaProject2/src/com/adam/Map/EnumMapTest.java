package com.adam.Map;

import java.util.EnumMap;

public class EnumMapTest {
	public static void main(String[] args) {
		//
		EnumMap enumMap = new EnumMap(Session.class);
		enumMap.put(Session.Spring, "��ů����");
		enumMap.put(Session.Summer, "��������");
		System.out.println(enumMap);
	}
}

enum Session{
	Spring, Summer, Fall, Winter
}