package com.adam.Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnmodifiableTest {
	public static void main(String[] args) {
		//创建一个空的 不可变的List对象
		List<Object> unmodifiableList = Collections.emptyList();
		//创建一个只有一个元素 不可改变的Set对象
		Set<String> unmodifiableSet = Collections.singleton("疯狂Java讲义");
		//创建一个普通的Map对象
		HashMap<Object, Object> map = new HashMap<>();
		map.put("语文", 80);
		map.put("数学", 82);
		//返回普通的Map对象对应的不可变版本
		Map<Object, Object> unmodifiableMap = Collections.unmodifiableMap(map);
		//下面的任何一行都将引起UnsupportedOperationException异常
		unmodifiableList.add("测试元素");
		unmodifiableSet.add("测试元素");
		unmodifiableMap.put("语文", 90);
	}
}
