package com.adam.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SearchTest {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums);
		System.out.println(Collections.max(nums)); //������Ԫ�� 3
		System.out.println(Collections.min(nums)); //�����СԪ�� -5
		System.out.println(Collections.replaceAll(nums, 0, 1)); //ʹ����ֵ�滻��ֵ
		System.out.println(nums);
		Collections.sort(nums); //�Լ��Ͻ�������
		System.out.println(nums);
		//ֻ��������list���ϲ���ʹ�ö��ַ���ѯ, ��� 3
		System.out.println(Collections.binarySearch(nums, 3));
	}
}
