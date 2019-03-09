package com.adam.Map;

import java.util.Hashtable;

public class HashTableTest {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(new A(60000), "a");
		ht.put(new A(87653), "b");
		ht.put(new A(1232), new B());
		ht.put(4, "c");
		System.out.println(ht +"-"+ ht.size());
		//只要两个对象通过equals()方法比较返回true
		//Hashtable就认为它们是相等的
		System.out.println(ht.containsValue("c")); //返回true
		//只要两个A对象的count相等，他们通过equals()方法比较返回true，且hashCode值相等
		//Hashtable即认为它们是相等的
		System.out.println(ht.get(new A(87653)));
		System.out.println(ht.containsKey(new A(87653)));// false
		System.out.println(ht.containsKey(4));// true
		ht.remove(new A(1232));
		System.out.println(ht);
	}
}

class A{
	int count;
	public A(int count){
		this.count = count;
	}
	//根据count的值来判断两个对象是否相等
	public boolean equales(Object obj) {
		if(obj == this) {
			return true;
		}
		if(obj != null && obj.getClass() == A.class) {
			A a = (A) obj;
			return this.count == a.count;
		}
		return false;
	}
	//根据count来计算hashCode值
	public int hashCode(){
		return this.count;
	}
}

class B{
	//重写equals()方法， B对象与任何对象通过equals()方法比较都返回true
	public boolean equals(Object obj) {
		return true;
	}
}