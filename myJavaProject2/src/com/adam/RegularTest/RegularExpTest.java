package com.adam.RegularTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpTest {

	public static void main(String[] args) {
		System.out.println("\u0041\\\\"); //print 'A\\'
		System.out.println("\u0061\t"); //匹配a<制表符>
		System.out.println("\\?\\[");	//匹配？[
		String str = "hello, java!";
		System.out.println(str.replaceFirst("\\w*", "■"));
		System.out.println("------------------");
		//讲一个正则表达式编译成Pattern对象
		Pattern p = Pattern.compile("a*b");
		//使用Pattern对象创建Matcher对象
		Matcher m = p.matcher("aaaaab");
		boolean b = m.matches();
		System.out.println(b);
		//find() 返回目标字符串中是否包含与Pattern匹配的子串
//		m = p.matcher("cd");
//		b = m.find();
//		System.out.println(b);
		//group()返回上一次与Pattern匹配的子串
		String s = m.group();
		System.out.println(s);
		//start()返回上一次与Pattern匹配的子串在目标字符串中的开始位置
		int a = m.start();
		System.out.println(a);
		//end()返回上一次与Pattern匹配的字符串在目标字符串中的结束位置加1
		int e = m.end();
		System.out.println(e);
		
	}

}
