package com.adam.enumTest;

public enum Gender2 implements GenderDesc{
	//�˴���ö�������ʹ����Ӧ�Ĺ�����������
	MALE("Ů"),FEMALE("��");
	private final String name;
	//ö����Ĺ���������ʹ��private����
	private Gender2(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	//ʵ�ֽӿڵĳ��󷽷�
	@Override
	public void test(){
		System.out.println("����һ�����ڶ����Ա��ö����");
	}
}
