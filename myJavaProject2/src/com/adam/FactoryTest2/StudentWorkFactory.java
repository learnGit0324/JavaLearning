package com.adam.FactoryTest2;

public class StudentWorkFactory
implements IWorkFactory{
	/**
	 *  �ض��幤�������Է���һ��StudentWorkʵ����
	 */
	@Override
	public Work getWork() {
		// TODO Auto-generated method stub
		return new StudentWork();
	}
	
}
