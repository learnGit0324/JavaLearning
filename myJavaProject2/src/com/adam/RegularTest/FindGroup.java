package com.adam.RegularTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʹ���ַ���ģ��������ϵõ���ҳԴ��
		String str = "�˾�	110\r\n" + 
				"��	119\r\n" + 
				"��������	120\r\n" + 
				"��ͨ�¹�	122\r\n" + 
				"�������ű���	12110\r\n" + 
				"ˮ�����ר��	12395\r\n" + 
				"����Ԥ��	12121\r\n" + 
				"��ʱ����	12117\r\n" + 
				"ɭ�ֻ�	12119\r\n" + 
				"��ʮ�ֻἱ��̨	999";
//		System.out.println(str);
		//����һ��Pattern���󣬲���������һ��Matcher���� ���øö���ֻץȡ��λ���ֻ�����
		Matcher m = Pattern.compile("\\d{3}").matcher(str);
		boolean b = m.matches();
		System.out.println(b);
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
