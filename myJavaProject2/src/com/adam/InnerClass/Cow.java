package com.adam.InnerClass;

public class Cow {
	private double weight;
	//�ⲿ������ع�����
	public Cow() {}
	public Cow(double weight) {
		this.weight = weight;
	}
	//����һ���Ǿ�̬�ڲ���
	private class CowLeg {
		//�Ǿ�̬�ڲ����������Ա����
		private double length;
		private String color;
		//�Ǿ�̬�ڲ�����������ع�����
		public CowLeg() {}
		public CowLeg(double length, String color) {
			this.length = length;
			this.color = color;
		}
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		//�Ǿ�̬�ڲ����ʵ������
		public void  info() {
			System.out.println("��ǰţ�ȵ���ɫ�ǣ�"+color+"���ߣ�"+length);
			//ֱ�ӷ����ⲿ���private���εĳ�Ա����
			System.out.println(weight);
		}
	}
	public void test() {
		CowLeg cl = new CowLeg(1.12, "�ڰ����");
		cl.info();
	}
	public static void main(String[] args) {
		Cow cow = new Cow(13.7);
		cow.test();
	}
}
