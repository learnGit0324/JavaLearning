package com.adam.FactoryTest2;

public class StudentWorkFactory
implements IWorkFactory{
	/**
	 *  重定义工厂方法以返回一个StudentWork实例。
	 */
	@Override
	public Work getWork() {
		// TODO Auto-generated method stub
		return new StudentWork();
	}
	
}
