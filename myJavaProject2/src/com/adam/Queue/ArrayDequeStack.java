package com.adam.Queue;

import java.util.ArrayDeque;

public class ArrayDequeStack {
	/**
	 * Deque��Queue�ӿڵ��ӽӿ� ����һ��˫�˶���
	 */
	public static void main(String[] args) {
		ArrayDeque<String> stack = new ArrayDeque<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		//�����������Կ����� �����Ƚ��ȳ�
		System.out.println(stack);
		//���ʶ���ͷ��Ԫ�� ����������pool������"ջ"
		System.out.println(stack.peek());
		//pool�����е�һ��Ԫ��
		System.out.println(stack.poll());
		System.out.println(stack);
	}
}
