package com.adam.chapter9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenericList {
	public static void main(String[] args) {
		//�ڵ��ù�������������ʱ�� Java 7֮����Բ�����ָ��������Ϣ�ˣ� ֻ��Ҫʹ��<>�Ϳ�����
		List<String> strList = new ArrayList<>();
		strList.add("Java");
		strList.add("JavaScript");
		//��ָ���˼���Ԫ�ص�����֮�󣬲����㼯��Ԫ�����͵�Ԫ�ز���������ӵ�������
		// strList.add(5); //�˴�������� �����㷺��
		strList.forEach(str -> System.out.println(str.length()));
		
		HashMap<String, List<String>> schoolesInfo = new HashMap<>();
		
		//Java�Զ��ƶϳ�ArrayList��<>��Ӧ����String
		ArrayList<String> schooles = new ArrayList<>();
		schooles.add("б�����Ƕ�");
		schooles.add("����ȡ��·");
		schoolesInfo.put("�����", schooles);
		//����Mapʱ��Map��key��String���ͣ���value��List<String>����
		schoolesInfo.forEach((key, value) -> System.out.println(key +"-->"+ value));
	}
}
