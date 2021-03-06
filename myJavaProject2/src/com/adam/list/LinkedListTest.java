package com.adam.list;

import java.util.LinkedList;

public class LinkedListTest {
	/**
	 * LinkedList与ArrayList、ArrayDeque的实现机制完全不同 
	 * ArrayList, ArrayDeque内部以数组的形式来保存集合中的元素，因此随记访问集合元素的性能较好
	 * 
	 * ArrayList的性能比LinkedList要好，因此大部分时候应该考虑使用ArrayList
	 * 
	 * 遍历List集合元素,对于ArrayList、Vector集合，应该采取随记访问方法(get)来遍历集合
	 * 对于LinkedList集合，应该采取迭代器Iterator来遍历集合元素
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<String> books = new LinkedList<>();
		//将字符串元素添加到队列的尾部
		books.offer("Java");
		//将一个字符串元素加入栈的顶部
		books.push("Oracle");
		//将字符串元素添加到队列的头部
		books.addFirst("Andriod");
		//遍历集合元素
		for (int i = 0; i < books.size(); i++) {
			System.out.println("遍历中："+books.get(i));
		}
		//访问并不删除栈顶的元素
		System.out.println(books.peekFirst());
		//访问并不删除队列的最后一个元素
		System.out.println(books.peekLast());
		//将栈顶的元素弹出栈
		System.out.println(books.pop());
		System.out.println(books);
		//访问并删除队列的最后一个元素
		System.out.println(books.pollLast());
		System.out.println(books);
	}
}
