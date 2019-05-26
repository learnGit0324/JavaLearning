package com.adam.Map;

import java.util.Hashtable;

public class HashTableTest {
	public static void main(String[] args) {		
		Hashtable<Object, Object> ht = new Hashtable<>();
		ht.put(1, "Aa");
		ht.put(1, "Aa");
		ht.put(2, "Ab");
		System.out.println(ht); // 输出{2=Ab, 1=Aa}
		ht.put(2, "Ac");
		System.out.println(ht); // 输出{2=Ac, 1=Aa} 说明只要key的equals相等就表示两个元素相等，HashTable就存不进去， 但是value会发生被替换
		//下面的 new A(60000 在对应的是不同的key， 从打印的结果可以看到这两个key-value对都储存了
		ht.put(new A(60000), "a");
		ht.put(new A(60000), "c");
		
		ht.put(new A(87653), "b");
		ht.put(new A(1232), new B());
		System.out.println(ht +"-"+ ht.size());
		//只要两个对象通过equals()方法比较返回true
		//Hashtable就认为它们是相等的
		System.out.println(ht.containsValue("c")); //返回true
		//只要两个A对象的count相等，他们通过equals()方法比较返回true，且hashCode值相等
		//Hashtable即认为它们是相等的
		System.out.println(ht.get(new A(87653)));
		System.out.println(ht.containsKey(new A(87653)));// false
		System.out.println(ht.containsKey(4));
		ht.remove(new A(1232));
		System.out.println(ht +"-"+ ht.size());
		
		boolean b = new A(5).equals(new A(5));
		System.out.println(b);
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