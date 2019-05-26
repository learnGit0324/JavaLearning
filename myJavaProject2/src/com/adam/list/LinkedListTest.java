package com.adam.list;

import java.util.LinkedList;

public class LinkedListTest {
	/**
	 * LinkedList��ArrayList��ArrayDeque��ʵ�ֻ�����ȫ��ͬ 
	 * ArrayList, ArrayDeque�ڲ����������ʽ�����漯���е�Ԫ�أ������Ƿ��ʼ���Ԫ�ص����ܽϺ�
	 * 
	 * ArrayList�����ܱ�LinkedListҪ�ã���˴󲿷�ʱ��Ӧ�ÿ���ʹ��ArrayList
	 * 
	 * ����List����Ԫ��,����ArrayList��Vector���ϣ�Ӧ�ò�ȡ��Ƿ��ʷ���(get)����������
	 * ����LinkedList���ϣ�Ӧ�ò�ȡ������Iterator����������Ԫ��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<String> books = new LinkedList<>();
		//���ַ���Ԫ����ӵ����е�β��
		books.offer("Java");
		//��һ���ַ���Ԫ�ؼ���ջ�Ķ���
		books.push("Oracle");
		//���ַ���Ԫ����ӵ����е�ͷ��
		books.addFirst("Andriod");
		//��������Ԫ��
		for (int i = 0; i < books.size(); i++) {
			System.out.println("�����У�"+books.get(i));
		}
		//���ʲ���ɾ��ջ����Ԫ��
		System.out.println(books.peekFirst());
		//���ʲ���ɾ�����е����һ��Ԫ��
		System.out.println(books.peekLast());
		//��ջ����Ԫ�ص���ջ
		System.out.println(books.pop());
		System.out.println(books);
		//���ʲ�ɾ�����е����һ��Ԫ��
		System.out.println(books.pollLast());
		System.out.println(books);
	}
}
