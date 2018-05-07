package com.adam.CommandModel;

public class CommandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessArray pa = new ProcessArray();
		int[] target = {3, -4, 6, 4};
		//第一次处理数据，具体处理行为取决于PrintCommand
		pa.process(target, new PrintCommand());
		//第二次处理数据，具体处理行为取决于AddCommand
		pa.process(target, new AddCommand());
	}

}
