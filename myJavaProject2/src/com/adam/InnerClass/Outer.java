package com.adam.InnerClass;

public class Outer {
	private int outProp = 9;
	class Inner{
		private int inProp = 5;
		public void accessOuterProp() {
			//�Ǿ�̬�ڲ������ֱ�ӷ����ⲿ���private��Ա����
			System.out.println("�ⲿ���outPropֵ��"+outProp);
		}
	}
	public void accessInnerProp() {
		//������� �ⲿ�಻��ֱ�ӷ��ʷǾ�̬�ڲ����ʵ������
//		System.out.println("�ڲ����inPropֵ�ǣ�"+inProp);
		System.out.println("�ڲ����inPropֵ�ǣ�"+new Inner().inProp);
	}
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.accessInnerProp();
	}
}
