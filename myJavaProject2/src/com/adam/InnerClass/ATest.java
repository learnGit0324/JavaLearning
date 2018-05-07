package com.adam.InnerClass;

public class ATest {
	public static void main(String[] args) {
		int age = 8; //变量age属于局部变量
		A a = new A() {

			@Override
			public void test() {
				// TODO Auto-generated method stub
				//在Java 8之前下面的语法将提示错误，age必须使用final修饰
				//从Java 8开始，匿名内部类，局部内部类允许访问非final的局部变量
				System.out.println(age);
			}
			
		};
		a.test();
		//Local variable age defined in an enclosing scope must be final or effectively final
		//age被final修饰，不能重新被赋值
		//age = 10;
	}
}
interface A{
	//A接口只定义了抽象方法
	void test();
}