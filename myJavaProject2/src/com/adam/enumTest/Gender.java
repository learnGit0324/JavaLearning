package com.adam.enumTest;

public enum Gender implements GenderDesc{
	MALE,FEMALE;
	//����һ��public���ε�ʵ������
	public String name;
	//��װname���� �����ⲿ����ֱ�ӷ���
	public void setName(String name) {
		switch(this) {
		case MALE:
			if (name.equals("��")) {
				this.name = name;
			}
			else {
				System.out.println("��������");
				return;
			}
			break;
		case FEMALE:
			if(name.equals("Ů")) {
				this.name = name;
			}
			else {
				System.out.println("��������");
				return;
			}
			break;
		}
	}
	public String getName(){
		return this.name;
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("����һ�����ڶ����Ա��ö����");
	}
}
