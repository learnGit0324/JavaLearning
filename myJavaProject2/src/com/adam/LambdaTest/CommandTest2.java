package com.adam.LambdaTest;

import com.adam.CommandModel.ProcessArray;

public class CommandTest2 {
	public static void main(String[] args) {
		ProcessArray pa = new ProcessArray();
		int[] array = {3,-4,4,6};
		//��ʹ��Lambda���ʽʱ��������Ҫnew Xxx(){}���������Ĵ���
		//Ҳ����Ҫ֧����д�ķ�����Ҳ����Ҫ������д�����ķ���ֵ����
		//ֻ��Ҫ������д�ķ��������Լ���������β��б���
		pa.process(array, (int[] target) -> {
			int sum = 0;
			for(int tmp:target) {
				sum += tmp;
			}
			System.out.println("����Ԫ�ص��ܺ� �ǣ�"+sum);
		});
	}
}
