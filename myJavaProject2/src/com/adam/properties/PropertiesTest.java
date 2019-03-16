package com.adam.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class PropertiesTest {
	public static void main(String[] args) throws Exception {
		Properties props = new Properties();
		props.setProperty("userName", "Adam");
		props.setProperty("passWord", "123456");
		props.store(new FileOutputStream("a.ini"), "comment line");
		//新建一个Properties对象
		Properties props2 = new Properties();
		props2.setProperty("gender", "male");
		props2.load(new FileInputStream("a.ini"));
		System.out.println(props2);
		
	}
}
