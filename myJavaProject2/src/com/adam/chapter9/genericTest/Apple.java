package com.adam.chapter9.genericTest;

/**
 * �趨���͵��β����� T extends Number ����T�βδ����ʵ������ֻ����Number���Number�������
 * ע�⣺����ͬʱ�̳и��ࡢʵ�ֽӿ����Ƶ��ǣ�Ϊ�����β�ָ���������ʱ�����еļɿ����߱���λ��������֮��
 */
public class Apple<T extends Number> {
	T col;
	public static void main(String[] args) {
		Apple<Integer> a1 = new Apple<>();
		Apple<Double> a2 = new Apple<>();
		//����Ĵ��뽫���ֱ����������Ĵ���ʦͽ��String���ʹ��ݸ�T�β�
		//��String����Number�������ͣ���������������
//		Apple<String> a3 = new Apple<>(); 
	}
}
