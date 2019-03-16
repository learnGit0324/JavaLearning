package com.adam.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap scores = new LinkedHashMap();
		scores.put("语文", 80);
		scores.put("数学", 85);
		scores.put("英语", 85);
		//LinkedHashMap可以记住key-value的添加顺序
		scores.forEach((key, value) -> System.out.println(key+"-"+value));
	}
}
