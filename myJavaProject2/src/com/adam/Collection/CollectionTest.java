package com.adam.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.junit.Test;

public class CollectionTest {
	
	@Test
	public void collectionTest1() {
		Collection c = new ArrayList<>();
		//add elements 
		c.add("Adam");
		//���ȼ������治�ܷŻ������͵�ֵ������Java֧���Զ���װ
		c.add(6);
		System.out.println("����c��Ԫ�ظ���Ϊ�� "+c.size());
		//ɾ���ƶ�Ԫ��
		c.remove(6);
		System.out.println("����c��Ԫ�ظ���Ϊ�� "+c.size());
		//�ж��Ƿ�����ƶ��ַ���
		System.out.println("c�����Ƿ����\"Adam\"�ַ���: "+c.contains("Adam") );
		c.add("Java");
		System.out.println("c���ϵ�Ԫ�أ�"+c);
		
		Collection books = new HashSet();
		books.add("Java");
		books.add("Python");
		System.out.println("c�����Ƿ����books��"+c.containsAll(books));
		c.removeAll(books); //��c���ϼ�ȥbooks���Ԫ��
		System.out.println("c���ϵ�Ԫ�أ�"+c);
		//ɾ��c�е�����Ԫ��
		c.clear();
		System.out.println("c���ϵ�Ԫ�أ�"+c);
		books.retainAll(c); //����books������ֻʣ��c������Ҳ������Ԫ��
		System.out.println("books���ϵ�Ԫ�أ� "+books);
	}
	
	
}
