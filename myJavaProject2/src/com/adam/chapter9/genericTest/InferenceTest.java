package com.adam.chapter9.genericTest;

public class InferenceTest {
	public static void main(String[] args) {
		//����ͨ��������ֵ��Ŀ��������ƶϷ���ΪString
		MyUtil<String> ls = MyUtil.nil();
		//����ʹ�����������ڵ���nil()����ʱָ�����͵�����
		MyUtil<String> mu = MyUtil.<String>nil();
		//�ɵ���cons()��������Ҫ�Ĳ����������ƶϷ���ΪInteger
		MyUtil.cons(42, MyUtil.nil());
		//����ʹ�����������ڵ���nil()����ʱָ�����͵�����
		MyUtil.cons(42, MyUtil.<Integer>nil());
	}
}

class MyUtil<E>{
	public static <T> MyUtil<T> nil(){
		return null;
	}
	
	public static <T> MyUtil<T> cons(T head, MyUtil<T> tail){
		return null;
	}
}