package com.adam.Map;

import java.util.HashMap;

public class NullInHashMap {
	public static void main(String[] args) {
		HashMap<Object, Object> hm = new HashMap<>();
		//试图将两个key为null值得key-value对放入HashMap中
		hm.put(null, null);
		hm.put(null, null);
		hm.put("a", null);
		System.out.println(hm);
	}
}
