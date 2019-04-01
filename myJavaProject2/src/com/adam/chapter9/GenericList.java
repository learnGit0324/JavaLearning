package com.adam.chapter9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenericList {
	public static void main(String[] args) {
		//在调用构造器创建对象时， Java 7之后可以不用在指定泛型信息了， 只需要使用<>就可以了
		List<String> strList = new ArrayList<>();
		strList.add("Java");
		strList.add("JavaScript");
		//在指定了集合元素的类型之后，不满足集合元素类型的元素不在允许添加到集合了
		// strList.add(5); //此处编译错误 不满足泛型
		strList.forEach(str -> System.out.println(str.length()));
		
		HashMap<String, List<String>> schoolesInfo = new HashMap<>();
		
		//Java自动推断出ArrayList的<>里应该是String
		ArrayList<String> schooles = new ArrayList<>();
		schooles.add("斜月三星洞");
		schooles.add("西天取经路");
		schoolesInfo.put("孙悟空", schooles);
		//遍历Map时，Map的key是String类型，而value是List<String>类型
		schoolesInfo.forEach((key, value) -> System.out.println(key +"-->"+ value));
	}
}
