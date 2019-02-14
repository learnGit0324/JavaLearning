package com.adam.Set;

import java.util.HashSet;

import org.junit.Test;

public class HashSetTest {
	
	/**
	 * Set集合是一个无序的集合 不允许有重复的元素
	 * HashSet
	 * TreeSet
	 * EnumSet
	 */
	
	/*
	 * HashSet类
	 * 不能保证元素的排列顺序
	 * HashSet不是同步的 多线程访问时必须考虑同步问题
	 * 集合元素可以使null
	 * 
	 * 比较HashSet集合元素相等：
	 * 两个对象通过equals()方法比较相等
	 * 并且两个对象的hashCode()方法返回值也相等
	 */
	@Test
	public void hashSetTest1() {
		HashSet books = new HashSet();
		/**
		 * 从返回结果来看 C类重写了equals()和hashCode()方法， 使得HashSet吧两个C对象当成同一个对象
		 * 
		 */
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		System.out.println(books);
	}

	
	
}

class A {
	public boolean equals(Object obj) {
		return true;
	}
}

class B {
	public int hashCode() {
		return 1;
	}
}

class C {
	public int hashCode() {
		return 2;
	}
	public boolean equals(Object obj) {
		return true;	
	}
}