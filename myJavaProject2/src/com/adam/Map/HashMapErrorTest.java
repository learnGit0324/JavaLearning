package com.adam.Map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapErrorTest {
	public static void main(String[] args) {
		HashMap<A, String> ht = new HashMap<A, String>();
		ht.put(new A(6000), "���Java����");
		ht.put(new A(87563), "������Java EE��ҵ��Ӧ��ʵ��");
		System.out.println(ht);
		//���Hashtable��key set���϶�Ӧ��Iterator������
		Iterator<A> it = ht.keySet().iterator();
		//ȡ��Map�еĵ�һ��key ���޸�����countֵ
		A first = it.next();
		first.count = 87563;
		System.out.println(ht);
		ht.remove(new A(87563)); //����removeʧ������ΪA��equals��������false
		System.out.println(ht);
		System.out.println(ht.get(new A(87563)));
	}
}
