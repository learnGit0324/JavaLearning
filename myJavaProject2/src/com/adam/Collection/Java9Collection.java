package com.adam.Collection;

import java.util.Map;
import java.util.Set;

import com.sun.tools.javac.util.List;

public class Java9Collection {
	public static void main(String[] args) {
		//Java 9 新增的不可变集合 程序直接调用Map List Set的of()方法
		
		//创建包含四个元素的Set集合
		Set<String> set = Set.of("A","B","C","D");
		System.out.println(set);
		//不可变集合 下面的到吗导致运行时出错
//		 set.add("E"); 
		//创建包含四个元素的List集合
		List<Integer> list = List.of(1, 2, 3, 4);
		System.out.println(list);
		//不可变集合 下面的代码导致运行时错误
//		list.remove(0);
		//创建包含三个key-value对的Map集合
		Map<String, Integer> map = Map.of("语文", 80, "数学",82,"英语",90);
		System.out.println(map);
		//不可变集合 下面的代码导致运行时错误
//		map.remove("语文");
		
		//使用Map.Entry()构建显示的key-value对
		Map<String, Integer> map2 = Map.ofEntries(Map.entry("语文", 80), Map.entry("数学", 82), Map.entry("英文", 90));
		System.out.println(map2);
	}
}
