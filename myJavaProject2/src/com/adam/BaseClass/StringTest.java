package com.adam.BaseClass;

public class StringTest {
	public static void main(String[] args) {
		String s = new String("fkit.org");
		//charAt ȡ������δ֪���ַ�
		System.out.println(s.charAt(5));
		String s1 = new String("abcdrfg");
		String s2 = new String("abcgrfg");
		String s3 = new String("abcdrfgh");
		System.out.println(s1.compareTo(s2)); //����'d' - 'g'�Ĳ�
		System.out.println(s1.compareTo(s3)); //���س��Ȳ�
		System.out.println(s1.concat(s2)); //���ַ���ƴ������
		String s4 = "fkit.org";
		String s5 = "org";
		System.out.println(s4.endsWith(s5)); //�ж��Ƿ���ĳ�ַ�����β
		char[] c1 = {'I',' ','L','O','V','E',' ','J','A','V','A'};
		String s6= new String("ejb");
		s6.getChars(0, 3, c1, 7);
		System.out.println(c1);
		System.out.println(s1.indexOf(2));
		System.out.println(s4.indexOf(s5, 0));
		System.out.println(s4.indexOf(s5));
		System.out.println(s4.indexOf('i'));
		s4 = s4.replace("org", "com");
		System.out.println(s4);
		System.out.println(s4.lastIndexOf('r'));
		
	}
}
