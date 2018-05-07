package com.adam.InnerClass;

public class AnonymousInner {
	public void test(Device d) {
		System.out.println("������һ��"+d.getName()+",������"+d.getPrice());
	}
	public static void main(String[] args) {
		AnonymousInner ai = new AnonymousInner();
		//�����в����Ĺ���������Device����ʵ����Ķ���
		ai.test(new Device("����ʾ����") {

			@Override
			public double getPrice() {
				// TODO Auto-generated method stub
				return 67.8;
			}	
		});
		//�����޲����Ĺ���������Device����ʵ����Ķ���
		ai.test(new Device() {
			//��ʼ����
			{
				System.out.println("�����ڲ���ĳ�ʼ����");
			}
			//ʵ�ֳ��󷽷�
			@Override
			public double getPrice() {
				// TODO Auto-generated method stub
				return 56.2;
			}
			//��д�����ʵ������
			public String getName() {
				return "����";
			}
		});
	}
}
abstract class Device{
	//˽�г�Ա����
	private String name;
	//���󷽷�
	public abstract double getPrice();
	//����������
	public Device() {}
	public Device(String name) {
		this.name = name;
	}
	//��Ա����Name��getter��setter����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}