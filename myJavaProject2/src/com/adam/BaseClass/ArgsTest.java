package com.adam.BaseClass;

import java.util.Scanner;

public class ArgsTest {
	public static void main(String[] args) {
		System.out.println(args.length);
		for(String arg: args) {
			System.out.println(arg);
		}
		//System.in �����׼���� ���Ǽ�������
		Scanner sc = new Scanner(System.in);
		//��������һ�н�ֻ�ѻس���Ϊ�ָ���
		sc.useDelimiter("\n");
		//�ж��Ƿ�����һ��
		while(sc.hasNext()) {
			//���������
			System.out.println("��������������ǣ�"+sc.next());
		}
	}
}	
