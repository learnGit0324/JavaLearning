package com.adam.Map;

import java.util.WeakHashMap;

/**
	 * @function WeakHashMap��keyֻ�����˶�ʵ�ʶ����������
	 * @author zhaoj
	 *
	 */
public class WeakHashMapTest {
	public static void main(String[] args) {
		WeakHashMap whm = new WeakHashMap();
		whm.put(new String("����"), new String("����"));
		whm.put(new String("��ѧ"), new String("����"));
		whm.put(new String("Ӣ��"), new String("�е�"));
		
		whm.put("Java", new String("�е�"));
		
		System.out.println(whm);
		//֪ͨϵͳ ����������������
		System.gc();
		System.runFinalization();
		//��ֻ����һ��key-value��
		System.out.println(whm);
	}
}
