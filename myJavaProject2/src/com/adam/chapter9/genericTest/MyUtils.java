package com.adam.chapter9.genericTest;

import java.util.ArrayList;
import java.util.Collection;

public class MyUtils {
	
	public static void main(String[] args) {
		ArrayList<Number> ln = new ArrayList<>();
		ArrayList<Integer> li = new ArrayList<>();
		li.add(5);
		//�˴�׼ȷ֪�����һ�������Ƶ�Ԫ����Integer���ͣ� ��src����Ԫ��������ͬ
		Integer last = copy(ln, li);
		System.out.println(last);
	}
	
	//�����dest����Ԫ�ص����ͱ�������src����Ԫ�ص�������ͬ���������丸��
	public static <T> T copy(Collection<? super T> dest, Collection<T> src) {
		T last = null;
		for (T t : src) {
			last = t;
			dest.add(last);
		}
		return last;
	}
}
