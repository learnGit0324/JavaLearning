package com.adam.RegularTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用字符串模拟从网络上得到网页源码
		String str = "匪警	110\r\n" + 
				"火警	119\r\n" + 
				"急救中心	120\r\n" + 
				"交通事故	122\r\n" + 
				"公安短信报警	12110\r\n" + 
				"水上求救专用	12395\r\n" + 
				"天气预报	12121\r\n" + 
				"报时服务	12117\r\n" + 
				"森林火警	12119\r\n" + 
				"红十字会急救台	999";
//		System.out.println(str);
		//创建一个Pattern对象，并用它建立一个Matcher对象， 并用该对象只抓取三位的手机号码
		Matcher m = Pattern.compile("\\d{3}").matcher(str);
		boolean b = m.matches();
		System.out.println(b);
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
