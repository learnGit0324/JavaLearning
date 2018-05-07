package com.adam.LambdaTest;

import javax.swing.JFrame;

public class MethodRefer {

	public static void main(String[] args) {
		//下面代码使用Lambda表达式创建Converter对象
		Converter converter1 = from -> Integer.valueOf(from);
		Integer val = converter1.converter("99");
		System.out.println(val);
		//方法引用代替Lambda表达式:引用类方法
		//函数式接口中被实现的方法全部的参数传给该类方法作为参数
		Converter converter2 = Integer::valueOf;
		Integer val2 = converter2.converter("99");
		System.out.println(val2);
		//下面的表达式将使用Lambda表达式创建Converter对象
		//引用特定对象的实例方法
		Converter converter3 = from -> "fkit.org".indexOf(from);
		Integer val3 = converter3.converter("it");
		System.out.println(val3);
		//方法引用代替Lambda表达式：引用特定对象的实例方法
		//函数式接口中被实现的方法的全部参数传给该方法作为参数
		Converter converter4 = "fkit.org"::indexOf;
		Integer val4 = converter4.converter("it");
		System.out.println(val4);
		//引用某类对象的实例方法
		MyTest mt = (a,b,c) -> a.substring(b, c);
		String str = mt.test("Java I Love You", 2, 9);
		System.out.println(str);
		//方法引用代替Lambda表达式：引用某类对象的实例方法
		//函数式接口中被实现方法的第一个参数被作为调用者
		//后面的参数全部传递给该方法作为参数
		MyTest mt2 = String::substring;
		String str2 = mt2.test("Java I Love You", 2, 9);
		System.out.println(str2);
		//下面的代码使用Lambda表达式创建YouTest对象
		YouTest yt = (String a) -> new JFrame(a);
		JFrame jf= yt.win("我的窗口");
		System.out.println(jf);
		//构造器引用代替Lambda表达式
		//函数式接口中被实现方法的全部参数传给该构造器作为参数
		YouTest yt2 = JFrame::new;
	}
}
@FunctionalInterface
interface Converter{
	Integer converter(String from);
}
@FunctionalInterface
interface MyTest{
	String test(String a, int b, int c);
}
@FunctionalInterface
interface YouTest{
	JFrame win(String title);
}