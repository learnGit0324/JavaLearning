package com.adam.CommandModel;

public class PrintCommand implements Command {

	@Override
	public void process(int[] target) {
		// TODO Auto-generated method stub
		for(int tmp:target) {
			System.out.println("�������Ŀ�������Ԫ�أ�"+tmp);
		}
	}

}
