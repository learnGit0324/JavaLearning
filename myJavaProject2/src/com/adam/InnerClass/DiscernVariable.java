package com.adam.InnerClass;

public class DiscernVariable {
	private String prop = "�ⲿ���ʵ������";
	private class InClass{
		private String prop ="�ڲ����ʵ������";
		public void info() {
			String prop="�ֲ�����";
			//ͨ���ⲿ������.this.varName�������ⲿ���ʵ������
			System.out.println("�ⲿ���ʵ������ֵ��"+DiscernVariable.this.prop);
			//ͨ��this.varName�������ڲ����ʵ������
			System.out.println("�ڲ����ʵ������ֵ�ǣ�"+this.prop);
			//ֱ�ӷ��ʾֲ�����
			System.out.println("�ֲ�������"+prop);
		}
	}
	public void test() {
		InClass ic = new InClass();
		ic.info();
	}
	public static void main(String[] args) {
		new DiscernVariable().test();
	}
}
