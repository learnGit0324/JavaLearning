package com.adam.enumTest;

public enum SeasonEnum {
	//�ڵ�һ���г��ĸ�ö��ʵ��
	SPRING,SUMMER,FALL,WINTER;
	public static void main(String[] args) {
		// compareTo(E e) �÷���������ָ����ö�������Ƚ�˳��
		//ͬһ��ö����ʵ��ֻ������ͬ���͵�ö����ʵ�����бȽ�
		//�����ö�������λ��ָ��ö�������֮���򷵻�����
		//�����ö�������λ��ָ��ö�������֮ǰ���ⷵ�ظ���
		//���򷵻�0
		int a = SPRING.compareTo(SUMMER);
		System.out.println(a); // -1
		//ordinal���ڷ���ö����ʵ����ö���������ֵ
		int b = SPRING.ordinal();
		System.out.println(b);
		
	}
}
