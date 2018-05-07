package com.adam.enumTest;

public enum Operation {
	//每一个枚举值都必须提供抽象方法的实现
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
	//为枚举类定义一个抽象方法，
	//这个抽象方法由不同的枚举值提供不同的实现
	public abstract double eval(double x, double y);
	public static void main(String[] args) {
		System.out.println(Operation.PLUS.eval(3,  5));
		System.out.println(Operation.MINUS.eval(3, 5));
	}
}
