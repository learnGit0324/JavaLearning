package com.adam.CommandModel;

public class ProcessArray {
	/**
	 * process方法接收处理对象和处理方法
	 * @param target
	 * @param cmd
	 */
	public void process(int[] target, Command cmd) {
		cmd.process(target);
	}
}
