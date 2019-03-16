package com.adam.Map;

import java.util.EnumMap;

public class EnumMapTest {
	public static void main(String[] args) {
		//
		EnumMap enumMap = new EnumMap(Session.class);
		enumMap.put(Session.Spring, "´ºÅ¯»¨¿ª");
		enumMap.put(Session.Summer, "ÏÄÈÕÑ×Ñ×");
		System.out.println(enumMap);
	}
}

enum Session{
	Spring, Summer, Fall, Winter
}