package com.adam.list;

import java.util.Arrays;
import java.util.List;

public class FixedSizeList {
	/**
	 * �̶����ȵ�List
	 * ����ֻ�ܱ�������Ԫ�أ� �������ӻ�ɾ������Ԫ��
	 */
	public static void main(String[] args) {
		List<String> fixedList = Arrays.asList("���Java����","���IOS����","������Java EE��ҵӦ��ʵ��");
		//��ȡfixedList��ʵ���࣬�����Arrays$ArrayList
		System.out.println(fixedList.getClass());
		//ʹ�÷������ñ�������Ԫ��
		fixedList.forEach(System.out::println);
		//�������ӡ�ɾ��Ԫ�� �����׳�UnsupportedOperationException
		fixedList.add("A");
		fixedList.remove("���IOS����");
	}
}
