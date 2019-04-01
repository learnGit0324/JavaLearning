package com.adam.chapter9.genericTest;

/**
 * 设定泛型的形参上线 T extends Number 表明T形参传入的实际类型只能是Number类或Number类的子类
 * 注意：与类同时继承父类、实现接口类似的是，为泛型形参指定多个上限时，所有的忌口上线必须位于类上限之后。
 */
public class Apple<T extends Number> {
	T col;
	public static void main(String[] args) {
		Apple<Integer> a1 = new Apple<>();
		Apple<Double> a2 = new Apple<>();
		//下面的代码将出现编译错误，下面的代码师徒吧String类型传递给T形参
		//但String不是Number的子类型，所以引起编译错误
//		Apple<String> a3 = new Apple<>(); 
	}
}
