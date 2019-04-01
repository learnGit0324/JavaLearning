package com.adam.chapter9;

import java.util.ArrayList;

public class A extends Apple<String>{
	//正确重写父类的方法，返回值
	//与父类Apple<String>的返回值完全相同
	
	@Override
	public void setInfo(String info) {
		// TODO Auto-generated method stub
		super.setInfo(info);
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo();
	}
	/*
	//The return type is incompatible with Apple<String>.getInfo()
	public Object getInfo() {
		return "子类";
	}
	*/
	
	public static void main(String[] args) {
		//分别创建ArrayList<String> 和 ArrayList<Integer> 对象
		ArrayList<String> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		//调用getClass()方法来比较l1和l2是否相等 
		System.out.println(l1.getClass() == l2.getClass()); //true 因为不管泛型的实际类型参数是什么，它们运行时总有同样的类
	}
	
}
