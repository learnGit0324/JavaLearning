package com.adam.Map;

import java.util.Hashtable;

public class HashTableTest {
	public static void main(String[] args) {		
		Hashtable<Object, Object> ht = new Hashtable<>();
		ht.put(1, "Aa");
		ht.put(1, "Aa");
		ht.put(2, "Ab");
		System.out.println(ht); // ���{2=Ab, 1=Aa}
		ht.put(2, "Ac");
		System.out.println(ht); // ���{2=Ac, 1=Aa} ˵��ֻҪkey��equals��Ⱦͱ�ʾ����Ԫ����ȣ�HashTable�ʹ治��ȥ�� ����value�ᷢ�����滻
		//����� new A(60000 �ڶ�Ӧ���ǲ�ͬ��key�� �Ӵ�ӡ�Ľ�����Կ���������key-value�Զ�������
		ht.put(new A(60000), "a");
		ht.put(new A(60000), "c");
		
		ht.put(new A(87653), "b");
		ht.put(new A(1232), new B());
		System.out.println(ht +"-"+ ht.size());
		//ֻҪ��������ͨ��equals()�����ȽϷ���true
		//Hashtable����Ϊ��������ȵ�
		System.out.println(ht.containsValue("c")); //����true
		//ֻҪ����A�����count��ȣ�����ͨ��equals()�����ȽϷ���true����hashCodeֵ���
		//Hashtable����Ϊ��������ȵ�
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