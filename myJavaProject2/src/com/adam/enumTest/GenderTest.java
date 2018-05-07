package com.adam.enumTest;

public class GenderTest {
	public static void main(String[] args) {
		//通过Enum.valueOf来获取指定枚举类的枚举值
		Gender g = Enum.valueOf(Gender.class, "FEMALE");
		//直接为枚举值的name实例变量赋值
		g.name = "女";
		System.out.println(g+"代表:"+g.name);
		g.setName("男"); //这里提示参数错误  建议将枚举类设置为不可变类，也就是说它的成员变量值不允许被改变
		System.out.println(g+"代表："+g.name);
		Gender3 g3 = Gender3.FEMALE;
		g3.test();
	}
}
