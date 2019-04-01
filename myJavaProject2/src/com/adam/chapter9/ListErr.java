package com.adam.chapter9;

import java.util.ArrayList;
import java.util.List;import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class ListErr {
	public static void main(String[] args) {
		List strList = new ArrayList();
		strList.add("Java");
		strList.add("JavaScripts");
		strList.add(5);
		//试图把一个Integer对象转换为String对象 抛出了类型转换异常
		strList.forEach(str -> System.out.println(((String)str).length()));
		//为了在添加集合元素时就指定集合元素的类型，引入了泛型 Generic
	}
}
