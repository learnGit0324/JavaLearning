package com.adam.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Map map = new HashMap();
		// 删除该Map对象中的所有key-value对
		map.clear();
		// 查询Map中是否包含指定的key
		boolean b = map.containsKey(1);
		System.out.println(b);
		boolean b1 = map.containsValue("a");
		System.out.println(b1);
		System.out.println(map.get("a")); // 不包含则返回null
		System.out.println(map.isEmpty()); // 检查Map是否为空

		Set set = map.keySet(); // 返回该Map中所有key组成的Set集合
		System.out.println(set);
		map.put(1, "A"); // 添加一个key-value对
		System.out.println("map:"+map);

		Map map2 = new HashMap();
		map2.putAll(map); // 将指定Map中的key-value对复制到本Map中
		System.out.println("map2:"+map2);
		
		map2.remove(1); //删除指定key所对应的key-value对
		System.out.println("map2"+map2);
		
		System.out.println("map size is: "+map.size());
		
		Collection c = map.values(); // 返回Map里所有values组成的Colelction
		System.out.println(c);
		
		for (Object key : map.keySet()) {
			System.out.println(key +"-->"+ map.get(key));
		}
		
	}
}
