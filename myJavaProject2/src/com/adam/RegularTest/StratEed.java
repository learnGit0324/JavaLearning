package com.adam.RegularTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StratEed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��Pattern���󣬲���������һ��Matcher����
		String regstr = "Java is very easy.";
		System.out.println(regstr);
		Pattern p = Pattern.compile("\\w+");
		Matcher m = p.matcher(regstr);
		while(m.find()) {
			System.out.println(m.group() +"�Ӵ�����ʼλ�ã�"+m.start()+"�Ӵ��Ľ���λ�ã�"+m.end());
		}
	}

}
