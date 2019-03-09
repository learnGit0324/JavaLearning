package com.adam.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Map map = new HashMap();
		// ɾ����Map�����е�����key-value��
		map.clear();
		// ��ѯMap���Ƿ����ָ����key
		boolean b = map.containsKey(1);
		System.out.println(b);
		boolean b1 = map.containsValue("a");
		System.out.println(b1);
		System.out.println(map.get("a")); // �������򷵻�null
		System.out.println(map.isEmpty()); // ���Map�Ƿ�Ϊ��

		Set set = map.keySet(); // ���ظ�Map������key��ɵ�Set����
		System.out.println(set);
		map.put(1, "A"); // ���һ��key-value��
		System.out.println("map:"+map);

		Map map2 = new HashMap();
		map2.putAll(map); // ��ָ��Map�е�key-value�Ը��Ƶ���Map��
		System.out.println("map2:"+map2);
		
		map2.remove(1); //ɾ��ָ��key����Ӧ��key-value��
		System.out.println("map2"+map2);
		
		System.out.println("map size is: "+map.size());
		
		Collection c = map.values(); // ����Map������values��ɵ�Colelction
		System.out.println(c);
		
		for (Object key : map.keySet()) {
			System.out.println(key +"-->"+ map.get(key));
		}
		
	}
}
