package com.adam.Map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) throws Exception {
		Properties props = new Properties();
		//��props�������
		props.setProperty("username", "adam");
		props.setProperty("password", "123456");
		//��props�е�key-value���浽a.ini�ļ���
		props.store(new FileOutputStream("a.ini"), "comment line");
		//�½�һ��Properties����
		Properties props1 = new Properties();
		//��props1���������
		props1.setProperty("gender", "male");
		//��a.ini�е�key-valueֵ׷�ӵ�props1��
		props1.load(new FileInputStream("a.ini"));
		System.out.println(props1);
		
	}
}
