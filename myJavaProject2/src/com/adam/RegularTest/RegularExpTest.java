package com.adam.RegularTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpTest {

	public static void main(String[] args) {
		System.out.println("\u0041\\\\"); //print 'A\\'
		System.out.println("\u0061\t"); //ƥ��a<�Ʊ��>
		System.out.println("\\?\\[");	//ƥ�䣿[
		String str = "hello, java!";
		System.out.println(str.replaceFirst("\\w*", "��"));
		System.out.println("------------------");
		//��һ��������ʽ�����Pattern����
		Pattern p = Pattern.compile("a*b");
		//ʹ��Pattern���󴴽�Matcher����
		Matcher m = p.matcher("aaaaab");
		boolean b = m.matches();
		System.out.println(b);
		//find() ����Ŀ���ַ������Ƿ������Patternƥ����Ӵ�
//		m = p.matcher("cd");
//		b = m.find();
//		System.out.println(b);
		//group()������һ����Patternƥ����Ӵ�
		String s = m.group();
		System.out.println(s);
		//start()������һ����Patternƥ����Ӵ���Ŀ���ַ����еĿ�ʼλ��
		int a = m.start();
		System.out.println(a);
		//end()������һ����Patternƥ����ַ�����Ŀ���ַ����еĽ���λ�ü�1
		int e = m.end();
		System.out.println(e);
		
	}

}
