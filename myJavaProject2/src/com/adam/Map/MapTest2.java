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
		 * ����key�����������value�������Ϊnull���򸲸�ԭ����value��;
		 * ���ԭ����value��λnull������valueΪnull����ɾ��Զkey-value�ԣ�
		 * ���ԭ����value���¼����valueͬʱΪnull����ô�÷������ı��κ�key-value�ԣ�ֱ�ӷ���null��
		 */
		BiFunction remappingFunction = (k, v) -> (v == null ? "NULL" : "b");
		map.compute(1, remappingFunction);
		System.out.println(map);
		
		/**
		 * ����key�����������value�������Ϊnull���򸲸�ԭ����value�����ԭMap��������key����ô�÷������ܻ����һ��key-value��
		 */
		Function mappingFunction = (key) -> "c";
		map.computeIfAbsent(2, mappingFunction);
		System.out.println(map);
		
		/**
		 * ����key�����������value�������Ϊnull���򸲸�ԭ����value�����������Ϊnull����ɾ��ԭkey-value��
		 */
		remappingFunction = (k, v) -> (v == null ? "NULL" : "b");
		map.computeIfPresent(2, remappingFunction);
		System.out.println(map);
		
		map.forEach((k, v) -> System.out.println("key:"+k+"value: "+map.get(k)));
		
		//��ȡָ��key��Ӧ��value
		map.getOrDefault(1, "c");
		System.out.println(map);
		
		map.getOrDefault(3, "c");
		System.out.println(map);
		
		//merge ��������key��ȡ����value�� �����ȡ��valueΪnull����ֱ���ô����value�滻��
		//�����ȡ��value��null�� ��ʹ��remappingFunction��������ԭvalue����value����һ���µ�value
		remappingFunction = (v1, v2) -> (v1+""+v2);
		map.merge(2, "s", remappingFunction);
		System.out.println(map);
		
		//putIfAbsent ���ָ����key��Ӧ��value�Ƿ�Ϊnull�� ���Ϊnull�� ��ʹ���ĵ�value����ԭ����nullֵ
		map.putIfAbsent(3, "ss");
		System.out.println(map);
		
		//remove������ָ����key��Ӧ��value�滻����value�� ���ָ����key�����ڣ� �򷵻�null
		map.remove(4, "sss");
		System.out.println(map);
		
		map.replaceAll(remappingFunction);
		System.out.println(map);
		
	}

}
