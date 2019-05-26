package com.adam.Map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) throws Exception {
		Properties props = new Properties();
		//想props添加属性
		props.setProperty("username", "adam");
		props.setProperty("password", "123456");
		//将props中的key-value保存到a.ini文件中
		props.store(new FileOutputStream("a.ini"), "comment line");
		//新建一个Properties对象
		Properties props1 = new Properties();
		//向props1中添加属性
		props1.setProperty("gender", "male");
		//将a.ini中的key-value值追加到props1中
		props1.load(new FileInputStream("a.ini"));
		System.out.println(props1);
		
	}
}
