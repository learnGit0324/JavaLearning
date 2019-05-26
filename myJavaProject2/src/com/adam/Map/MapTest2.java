package com.adam.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapTest2 {
	/**
	 * @function Test new Map method added from Java 8
	 * @param args
	 * @author zhaoj
	 */
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		System.out.println(map);
		/**
		 * 根据key计算出来的新value，如果不为null，则覆盖原来的value，;
		 * 如果原来的value部位null，但新value为null，则删除远key-value对；
		 * 如果原来的value和新计算的value同时为null，那么该方法不改变任何key-value对，直接返回null。
		 */
		BiFunction remappingFunction = (k, v) -> (v == null ? "NULL" : "b");
		map.compute(1, remappingFunction);
		System.out.println(map);
		
		/**
		 * 根据key计算出来的新value，如果不为null，则覆盖原来的value，如果原Map不包含该key，那么该方法可能会添加一组key-value对
		 */
		Function mappingFunction = (key) -> "c";
		map.computeIfAbsent(2, mappingFunction);
		System.out.println(map);
		
		/**
		 * 根据key计算出来的新value，如果不为null，则覆盖原来的value，如果计算结果为null，则删除原key-value对
		 */
		remappingFunction = (k, v) -> (v == null ? "NULL" : "b");
		map.computeIfPresent(2, remappingFunction);
		System.out.println(map);
		
		map.forEach((k, v) -> System.out.println("key:"+k+"value: "+map.get(k)));
		
		//获取指定key对应的value
		map.getOrDefault(1, "c");
		System.out.println(map);
		
		map.getOrDefault(3, "c");
		System.out.println(map);
		
		//merge 方法根据key获取到的value， 如果获取的value为null，则直接用传入的value替换；
		//如果获取的value不null， 则使用remappingFunction函数根据原value，新value计算一个新的value
		remappingFunction = (v1, v2) -> (v1+""+v2);
		map.merge(2, "s", remappingFunction);
		System.out.println(map);
		
		//putIfAbsent 检测指定的key对应的value是否为null， 如果为null， 则使用心得value代替原来的null值
		map.putIfAbsent(3, "ss");
		System.out.println(map);
		
		//remove方法将指定的key对应的value替换成新value， 如果指定的key不存在， 则返回null
		map.remove(4, "sss");
		System.out.println(map);
		
		map.replaceAll(remappingFunction);
		System.out.println(map);
		
	}

}
