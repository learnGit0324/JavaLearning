package com.adam.chapter9;

import java.util.ArrayList;
import java.util.List;import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class ListErr {
	public static void main(String[] args) {
		List strList = new ArrayList();
		strList.add("Java");
		strList.add("JavaScripts");
		strList.add(5);
		//��ͼ��һ��Integer����ת��ΪString���� �׳�������ת���쳣
		strList.forEach(str -> System.out.println(((String)str).length()));
		//Ϊ������Ӽ���Ԫ��ʱ��ָ������Ԫ�ص����ͣ������˷��� Generic
	}
}
