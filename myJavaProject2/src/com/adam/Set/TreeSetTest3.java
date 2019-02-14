package com.adam.Set;

import java.util.TreeSet;

public class TreeSetTest3 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		Z z1 = new Z(6);
		set.add(z1);
		//第二次添加同一个对象，输出true，说明添加成功
		System.out.println(set.add(z1));
		//下面输出set集合，将看到两个元素
		System.out.println(set);
		//修改set集合第一个元素的age变量
		((Z)(set.first())).age = 9;
		//输出set集合的最后一个元素的age变量，将看到也变成了9
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