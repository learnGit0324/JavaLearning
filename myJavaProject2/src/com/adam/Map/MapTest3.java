package com.adam.Map;

import java.util.Arrays;
import java.util.HashMap;

public class MapTest3 {
	public static void main(String[] args) {
		String[] arr = new String[]{"a","b","a","b","c","a","b","c","b"};
		System.out.println(Arrays.toString(arr));
		
		HashMap<String, Integer> hs = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			Integer num = hs.get(arr[i]);
//			System.out.println(num);
			hs.put(arr[i], num == null ? 1 : num + 1);
		}
		System.out.println(hs);
	}
}
