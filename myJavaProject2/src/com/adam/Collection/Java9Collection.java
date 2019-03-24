package com.adam.Collection;

import java.util.Map;
import java.util.Set;

import com.sun.tools.javac.util.List;

public class Java9Collection {
	public static void main(String[] args) {
		//Java 9 �����Ĳ��ɱ伯�� ����ֱ�ӵ���Map List Set��of()����
		
		//���������ĸ�Ԫ�ص�Set����
		Set<String> set = Set.of("A","B","C","D");
		System.out.println(set);
		//���ɱ伯�� ����ĵ���������ʱ����
//		 set.add("E"); 
		//���������ĸ�Ԫ�ص�List����
		List<Integer> list = List.of(1, 2, 3, 4);
		System.out.println(list);
		//���ɱ伯�� ����Ĵ��뵼������ʱ����
//		list.remove(0);
		//������������key-value�Ե�Map����
		Map<String, Integer> map = Map.of("����", 80, "��ѧ",82,"Ӣ��",90);
		System.out.println(map);
		//���ɱ伯�� ����Ĵ��뵼������ʱ����
//		map.remove("����");
		
		//ʹ��Map.Entry()������ʾ��key-value��
		Map<String, Integer> map2 = Map.ofEntries(Map.entry("����", 80), Map.entry("��ѧ", 82), Map.entry("Ӣ��", 90));
		System.out.println(map2);
	}
}
