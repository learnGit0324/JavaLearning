package com.adam.chapter9;

import java.util.ArrayList;

public class A extends Apple<String>{
	//��ȷ��д����ķ���������ֵ
	//�븸��Apple<String>�ķ���ֵ��ȫ��ͬ
	
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
		return "����";
	}
	*/
	
	public static void main(String[] args) {
		//�ֱ𴴽�ArrayList<String> �� ArrayList<Integer> ����
		ArrayList<String> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		//����getClass()�������Ƚ�l1��l2�Ƿ���� 
		System.out.println(l1.getClass() == l2.getClass()); //true ��Ϊ���ܷ��͵�ʵ�����Ͳ�����ʲô����������ʱ����ͬ������
	}
	
}
