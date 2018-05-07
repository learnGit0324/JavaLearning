package com.adam.enumTest;

public enum Operation {
	//ÿһ��ö��ֵ�������ṩ���󷽷���ʵ��
	PLUS {
		@Override
		public double eval(double x, double y) {
			// TODO Auto-generated method stub
			return x + y;
		}
	},MINUS {
		@Override
		public double eval(double x, double y) {
			// TODO Auto-generated method stub
			return x - y;
		}
	},TIMES {
		@Override
		public double eval(double x, double y) {
			// TODO Auto-generated method stub
			return x * y;
		}
	},DIVIDE {
		@Override
		public double eval(double x, double y) {
			// TODO Auto-generated method stub
			return x / y;
		}
	};
	//Ϊö���ඨ��һ�����󷽷���
	//������󷽷��ɲ�ͬ��ö��ֵ�ṩ��ͬ��ʵ��
	public abstract double eval(double x, double y);
	public static void main(String[] args) {
		System.out.println(Operation.PLUS.eval(3,  5));
		System.out.println(Operation.MINUS.eval(3, 5));
	}
}
