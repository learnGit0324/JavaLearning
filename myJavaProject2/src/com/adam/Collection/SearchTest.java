package com.adam.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SearchTest {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums);
		System.out.println(Collections.max(nums)); //输出最大元素 3
		System.out.println(Collections.min(nums)); //输出最小元素 -5
		System.out.println(Collections.replaceAll(nums, 0, 1)); //使用新值替换旧值
		System.out.println(nums);
		Collections.sort(nums); //对集合进行排序
		System.out.println(nums);
		//只有排序后的list集合才能使用二分法查询, 输出 3
		System.out.println(Collections.binarySearch(nums, 3));
	}
}
