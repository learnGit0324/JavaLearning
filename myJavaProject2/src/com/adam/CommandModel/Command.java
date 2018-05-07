package com.adam.CommandModel;

public interface Command {
	//接口里定义的process方法用于封装“处理行为”
	public abstract void process(int[] target); 
}
