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
		//ֻҪ��������ͨ��equals()�����ȽϷ���true
		//Hashtable����Ϊ��������ȵ�
		System.out.println(ht.containsValue("c")); //����true
		//ֻҪ����A�����count��ȣ�����ͨ��equals()�����ȽϷ���true����hashCodeֵ���
		//Hashtable����Ϊ��������ȵ�
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
	//����count��ֵ���ж����������Ƿ����
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
	//����count������hashCodeֵ
	public int hashCode(){
		return this.count;
	}
}

class B{
	//��дequals()������ B�������κζ���ͨ��equals()�����Ƚ϶�����true
	public boolean equals(Object obj) {
		return true;
	}
}