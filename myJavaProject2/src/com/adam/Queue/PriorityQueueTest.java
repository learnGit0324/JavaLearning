package com.adam.Queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
	/**
	 * PriorityQueue是一个比较标准的队列实现类，保存队列元素的顺序并不是按照加入队列的顺序，而四海按照队列元素的大小重新排序
	 */
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(6);
		pq.offer(-3);
		pq.offer(20);
		pq.offer(18);
		//输出pq队列， 可以看到并不是按照入队顺序输出
		System.out.println(pq);
		//访问队列的第一个元素, 其实就是队列中的最小元素
		System.out.println(pq.poll());
		//PriprityQueue 不允许插入null元素
//		pq.offer();
		System.out.println(pq.peek()); //取出队头的元素 但并不删除
		System.out.println(pq.element()); //取出队头的元素 但并不删除
	}
}
