package com.adam.Map;

import java.util.IdentityHashMap;

public class IdentityHashMapTest {
	public static void main(String[] args) {
		/**
		 * 只有当key1==key2，才认为两个key相同的，而不是普通的Map集合的equals返回true和hashCode值相等
		 */
		IdentityHashMap ihm = new IdentityHashMap();
		ihm.put(new String("语文"), 78);
		ihm.put(new String("数学"), 88);
		ihm.put("Java", 93);
		ihm.put("Java", 98);
		System.out.println(ihm);
	}
}
