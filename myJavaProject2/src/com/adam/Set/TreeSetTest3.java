package com.adam.Set;

import java.util.TreeSet;

public class TreeSetTest3 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		Z z1 = new Z(6);
		set.add(z1);
		//�ڶ������ͬһ���������true��˵����ӳɹ�
		System.out.println(set.add(z1));
		//�������set���ϣ�����������Ԫ��
		System.out.println(set);
		//�޸�set���ϵ�һ��Ԫ�ص�age����
		((Z)(set.first())).age = 9;
		//���set���ϵ����һ��Ԫ�ص�age������������Ҳ�����9
		System.out.println(((Z)(set.last())).age);
	}
}

class Z implements Comparable{
	
	int age;
	public Z (int age) {
		this.age = age;
	}
	//rewrite equals() method, always return true
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	//rewrite compareTo(Object o) method, always return 1
	@Override
	public int compareTo(Object o) {
		return 1;
	}
	
}