package com.adam.CommandModel;

public class PrintCommand implements Command {

	@Override
	public void process(int[] target) {
		// TODO Auto-generated method stub
		for(int tmp:target) {
			System.out.println("迭代输出目标数组的元素："+tmp);
		}
	}

}
