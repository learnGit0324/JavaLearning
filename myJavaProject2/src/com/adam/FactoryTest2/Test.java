package com.adam.FactoryTest2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorkFactory studentWorkFactory = new StudentWorkFactory();
		studentWorkFactory.getWork().doWork();
		IWorkFactory teacherWorkFactory = new TeacherWorkFactory();
		teacherWorkFactory.getWork().doWork();
	}

}
