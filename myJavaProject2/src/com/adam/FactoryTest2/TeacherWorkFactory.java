package com.adam.FactoryTest2;

public class TeacherWorkFactory implements IWorkFactory{

	@Override
	public Work getWork() {
		// TODO Auto-generated method stub
		return new TeacherWork();
	}
	
}
