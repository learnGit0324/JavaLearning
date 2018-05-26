package com.adam.BaseClass;

import java.util.Objects;

public class ObjectsTest {
	//定义一个obj变量，默认值是null
	static ObjectsTest obj;
	public static void main(String[] args) {
		//输出一个null对象的hashCode值 ， 输出是0 
		System.out.println(Objects.hashCode(obj));  
		//输出一个null对象的toString,输出是null
		System.out.println(Objects.toString(obj));
		//要求obj不能为空，如果obj为空，则引发异常
		System.out.println(Objects.requireNonNull(obj,"obj参数不能是null"));
	}
}
