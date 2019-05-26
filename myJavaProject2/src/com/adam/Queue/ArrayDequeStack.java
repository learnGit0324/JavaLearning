package com.adam.Queue;

import java.util.ArrayDeque;

public class ArrayDequeStack {
	/**
	 * Deque是Queue接口的子接口 代表一个双端队列
	 */
	public static void main(String[] args) {
		ArrayDeque<String> stack = new ArrayDeque<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		//从输出结果可以看到， 队列先进先出
		System.out.println(stack);
		//访问队列头部元素 但并不将其pool出队列"栈"
		System.out.println(stack.peek());
		//pool出队列第一个元素
		System.out.println(stack.poll());
		System.out.println(stack);
	}
}
