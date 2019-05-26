package com.adam.list;

import java.util.Arrays;
import java.util.List;

public class FixedSizeList {
	/**
	 * 固定长度的List
	 * 程序只能遍历集合元素， 不能增加或删除集合元素
	 */
	public static void main(String[] args) {
		List<String> fixedList = Arrays.asList("疯狂Java讲义","疯狂IOS讲义","轻量级Java EE企业应用实践");
		//获取fixedList的实现类，将输出Arrays$ArrayList
		System.out.println(fixedList.getClass());
		//使用方法引用遍历集合元素
		fixedList.forEach(System.out::println);
		//尝试增加、删除元素 都会抛出UnsupportedOperationException
		fixedList.add("A");
		fixedList.remove("疯狂IOS讲义");
	}
}
