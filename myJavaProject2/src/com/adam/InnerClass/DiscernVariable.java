package com.adam.InnerClass;

public class DiscernVariable {
	private String prop = "外部类的实例变量";
	private class InClass{
		private String prop ="内部类的实例变量";
		public void info() {
			String prop="局部变量";
			//通过外部类类名.this.varName来访问外部类的实例变量
			System.out.println("外部类的实例变量值："+DiscernVariable.this.prop);
			//通过this.varName来访问内部类的实例变量
			System.out.println("内部类的实例变量值是："+this.prop);
			//直接访问局部变量
			System.out.println("局部变量："+prop);
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
