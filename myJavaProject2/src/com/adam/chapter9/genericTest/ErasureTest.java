package com.adam.chapter9.genericTest;

public class ErasureTest {
	public static void main(String[] args) {
		Apple<Integer> a = new Apple<>(6);
		//a的getCol()方法返回Integer对象
		Integer as = a.getCol();
		//把a对象赋值给Apple变量，丢失尖括号里的信息
		Apple b = a;
		//b只是到col的类型是Number
		Number bs = b.getCol();
		//下面的代码编译错误
		//Type mismatch: cannot convert from Number to Integer
//		Integer bs2 = b.getCol();
	}
}
