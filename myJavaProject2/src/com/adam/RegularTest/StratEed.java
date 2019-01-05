package com.adam.RegularTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StratEed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个Pattern对象，并用它建立一个Matcher对象
		String regstr = "Java is very easy.";
		System.out.println(regstr);
		Pattern p = Pattern.compile("\\w+");
		Matcher m = p.matcher(regstr);
		while(m.find()) {
			System.out.println(m.group() +"子串的起始位置："+m.start()+"子串的结束位置："+m.end());
		}
	}

}
