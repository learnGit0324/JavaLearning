package com.adam.interfaceTest;

public class OutputFiledTest{
	public static void main(String[] args) {
		//����ͬһ�����е�Output�ӿ��е�MAX_CACHE_SIZE����
		System.out.println(Output.MAX_CACHE_SIZE);
		//���������ʾ�ӿ��еó������ܱ���ֵ ��Ϊ�䱻final����
//		Output.MAX_CACHE_SIZE = 20;
		//ʹ�ý���������෽��
		System.out.println(Output.stringTest());
	}
}
