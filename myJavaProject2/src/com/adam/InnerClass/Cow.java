package com.adam.InnerClass;

public class Cow {
	private double weight;
	//外部类的重载构造器
	public Cow() {}
	public Cow(double weight) {
		this.weight = weight;
	}
	//定义一个非静态内部类
	private class CowLeg {
		//非静态内部类的两个成员变量
		private double length;
		private String color;
		//非静态内部类的两个重载构造器
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
		//非静态内部类的实例方法
		public void  info() {
			System.out.println("当前牛腿的颜色是："+color+"，高："+length);
			//直接访问外部类的private修饰的成员变量
			System.out.println(weight);
		}
	}
	public void test() {
		CowLeg cl = new CowLeg(1.12, "黑白相间");
		cl.info();
	}
	public static void main(String[] args) {
		Cow cow = new Cow(13.7);
		cow.test();
	}
}
