package com.adam.Map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapErrorTest {
	public static void main(String[] args) {
		HashMap<A, String> ht = new HashMap<A, String>();
		ht.put(new A(6000), "疯狂Java讲义");
		ht.put(new A(87563), "轻量级Java EE企业级应用实践");
		System.out.println(ht);
		//获得Hashtable的key set集合对应的Iterator迭代器
		Iterator<A> it = ht.keySet().iterator();
		//取出Map中的第一个key 并修改它的count值
		A first = it.next();
		first.count = 87563;
		System.out.println(ht);
		ht.remove(new A(87563)); //这里remove失败是因为A的equals方法返回false
		System.out.println(ht);
		System.out.println(ht.get(new A(87563)));
	}
}
