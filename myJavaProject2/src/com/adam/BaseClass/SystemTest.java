package com.adam.BaseClass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;


public class SystemTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//��ȡϵͳ���е�
		Map<String, String> env = System.getenv();
		for(String name: env.keySet()) {
			System.out.println(name +"--->"+env.get(name));
		}
		//��ȡָ���Ļ���������ֵ
		System.out.println(System.getenv("JAVA_HOME"));
		//��ȡ���е�ϵͳ����
		Properties props = System.getProperties();
		//�����е�ϵͳ���Ա��浽proips.txt�ļ���
		props.store(new FileOutputStream("props.txt"), "System Properties");
		//����ض���ϵͳ����
		System.out.println(System.getProperty("os.name"));
		Long l = System.currentTimeMillis();
		System.out.println(l);
		System.out.println(System.nanoTime());
	}
}
