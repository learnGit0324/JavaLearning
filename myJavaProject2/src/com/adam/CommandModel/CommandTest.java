package com.adam.CommandModel;

public class CommandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessArray pa = new ProcessArray();
		int[] target = {3, -4, 6, 4};
		//��һ�δ������ݣ����崦����Ϊȡ����PrintCommand
		pa.process(target, new PrintCommand());
		//�ڶ��δ������ݣ����崦����Ϊȡ����AddCommand
		pa.process(target, new AddCommand());
	}

}
