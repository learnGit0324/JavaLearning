package com.adam.LambdaTest;

public class LambdaTest {
	public void getInfo(Info info) {
		System.out.println("�ҵ������ǣ�");
		System.out.println(info.getName("Adam"));
	} 
	public static void main(String[] args) {
		LambdaTest lt = new LambdaTest();
		lt.getInfo(name -> name);
	}
}
interface Info{
	String getName(String name);
}