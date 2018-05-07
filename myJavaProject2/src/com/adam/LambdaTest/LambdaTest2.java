package com.adam.LambdaTest;

public class LambdaTest2 {	
	public static void main(String[] args) {
		//Lambda的目标类型必须是明确的函数式接口
		//Lambda表达式只能为函数式接口创建对象
		
		//1 将Lambda表达式赋值给函数式接口类型的变量
		Runnanle r = () ->{
			int sum = 0;
			for(int i = 0; i<100; i++) {
				sum += i;
			}
			System.out.println(sum);
		};
		r.test();
		//2 将Lambda表达式作为函数式接口类型的参数传给某一个方法
		LambdaTest2 lt2 = new LambdaTest2();
		lt2.getTest(() ->{
			System.out.println("将Lambda表达式作为函数式接口类型的参数传给某一个方法");
		});
		//使用函数式接口对Lambda表达式强制类型转换
		Object obj =(Runnanle)() -> {
			System.out.println("使用函数式接口对Lambda表达式强制类型转换");
		};
		
	} 
	public void getTest(Runnanle r) {
		r.test();
	}
	//同样的Lambda表达式可以被当作不同的目标类型，
	//唯一的要求是Lambda表达式的形参列表与函数式的接口中唯一的抽象方法的形参类表相同
	Object obj2 = (FkTest)() -> {
		for(int i =0; i < 10; i++) {
			System.out.println();
		}
	};
}
interface Runnanle{
//	int a = 5;
	void test();
}
@FunctionalInterface
interface FkTest{
	void test();
}