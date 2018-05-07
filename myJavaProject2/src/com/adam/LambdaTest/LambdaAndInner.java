package com.adam.LambdaTest;

public class LambdaAndInner {
	private int age = 12;
	private static String  name = "疯狂软件教育中心";
	public void test() {
		String book = "疯狂Java讲义";
		Displayable dis = () -> {
			//访问 "effectively final"的局部变量
			System.out.println(book);
			//访问外部类的实例变量和类变量
			System.out.println(age);
			System.out.println(name);
		};
		dis.display();
		//调用dis对下你给从接口中结合才能的add()方法
		System.out.println(dis.add(3, 5));
		//尝试调用接口中得默认方法,编译器报错
//		System.out.println(add(3,5));
	}
	public void test2(Displayable displayable) {
		displayable.display();
	}
	public static void main(String[] args) {
		LambdaAndInner lambda = new LambdaAndInner();
				lambda.test();
				lambda.test2(new Displayable() {
					
					@Override
					public void display() {
						// TODO Auto-generated method stub
						System.out.println("Adam");
					}
				});
	}
}
@FunctionalInterface
interface Displayable{
	//定义一个抽象方法和默认方法
	void display();
	default int add(int a, int b) {
		return a+b;
	}
}