package com.adam.chapter9.genericTest;

public class ErasureTest {
	public static void main(String[] args) {
		Apple<Integer> a = new Apple<>(6);
		//a��getCol()��������Integer����
		Integer as = a.getCol();
		//��a����ֵ��Apple��������ʧ�����������Ϣ
		Apple b = a;
		//bֻ�ǵ�col��������Number
		Number bs = b.getCol();
		//����Ĵ���������
		//Type mismatch: cannot convert from Number to Integer
//		Integer bs2 = b.getCol();
	}
}
