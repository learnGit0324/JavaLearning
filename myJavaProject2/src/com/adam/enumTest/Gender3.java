package com.adam.enumTest;

public enum Gender3 implements GenderDesc{
	MALE("��"){
		public void test() {
			System.out.println("���ö��ֵ��������");
		}
	},
	FEMALE("Ů"){
		public void test() {
			System.out.println("���ö��ֵ����Ů��");
		}
	};
	private final String name;
	private Gender3(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("����һ�����ڷ����Ա��ö����");
	}

}
