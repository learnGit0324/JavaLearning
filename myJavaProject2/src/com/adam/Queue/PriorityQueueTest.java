package com.adam.Queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
	/**
	 * PriorityQueue��һ���Ƚϱ�׼�Ķ���ʵ���࣬�������Ԫ�ص�˳�򲢲��ǰ��ռ�����е�˳�򣬶��ĺ����ն���Ԫ�صĴ�С��������
	 */
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(6);
		pq.offer(-3);
		pq.offer(20);
		pq.offer(18);
		//���pq���У� ���Կ��������ǰ������˳�����
		System.out.println(pq);
		//���ʶ��еĵ�һ��Ԫ��, ��ʵ���Ƕ����е���СԪ��
		System.out.println(pq.poll());
		//PriprityQueue ���������nullԪ��
//		pq.offer();
		System.out.println(pq.peek()); //ȡ����ͷ��Ԫ�� ������ɾ��
		System.out.println(pq.element()); //ȡ����ͷ��Ԫ�� ������ɾ��
	}
}
