package com.adam.Map;

import java.util.HashMap;

public class NullInHashMap {
	public static void main(String[] args) {
		HashMap<Object, Object> hm = new HashMap<>();
		//��ͼ������keyΪnullֵ��key-value�Է���HashMap��
		hm.put(null, null);
		hm.put(null, null);
		hm.put("a", null);
		System.out.println(hm);
	}
}
