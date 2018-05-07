package com.adam.FactoryTest2;

public class StudentWork implements Work{
	/**
	 * 实现接口方法 doWork() 不同的类实现接口的方法的行为可能不同 ，学生做作业，而老师则是批作业
	 */
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("学生做作业");
	}
	
}
