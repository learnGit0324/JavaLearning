package com.adam.chapter9.genericTest;

import org.junit.Assert;

/**
 * �趨���͵��β����� T extends Number ����T�βδ����ʵ������ֻ����Number���Number�������
 * ע�⣺����ͬʱ�̳и��ࡢʵ�ֽӿ����Ƶ��ǣ�Ϊ�����β�ָ���������ʱ�����еļɿ����߱���λ��������֮��
 */
public class Apple<T extends Number> {
	T col;
	
	public Apple(T col) {
		
	}
	
	
	public T getCol() {
		return col;
	}


	public void setCol(T col) {
		this.col = col;
	}

	public static void main(String[] args) {
		Apple<Integer> a1 = new Apple<>(3);
		Apple<Double> a2 = new Apple<>(3.0);
		Assert.assertNotNull(a1);
		Assert.assertNotNull(a2);
		
		//����Ĵ��뽫���ֱ����������Ĵ���ʦͽ��String���ʹ��ݸ�T�β�
		//��String����Number�������ͣ���������������
//		Apple<String> a3 = new Apple<>(); 
	}
}
