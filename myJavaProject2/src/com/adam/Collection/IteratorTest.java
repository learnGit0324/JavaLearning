package com.adam.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

public class IteratorTest {
	/**
	 * ���������ʾ iterator�������ṩʢװ���������
	 */
	@Test
	public void iteratorTest1() {
		// ��������
		Collection books = new HashSet();
		books.add("Java");
		books.add("Python");
		books.add("Android");
		// ��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
		while (it.hasNext()) {
			// it.next()���ص�����������object���ͣ� �����Ҫ��������ת��
			String book = (String) it.next();
			System.out.println(book);
			if (book.equals("Andriod")) {
				it.remove();
			}
			// ��book������ֵ ����ı伯��Ԫ�ر���
			book = "C++";
		}
		System.out.println(books);
	}

	/**
	 * �ڼ��ϱ��������� ��Ҫ���м���Ԫ�ص����ɾ���Ȳ���
	 */
	@Test
	public void iteratorTest2() {
		Collection books = new HashSet();
		books.add("Java");
		books.add("Python");
		books.add("Android");
		// ��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
		while (it.hasNext()) {
			String book = (String) it.next();
			System.out.println(book);
			if (book.equals("Android")) {
				books.remove(book);
			}
		}
	}

	@Test
	public void predicateTest() {
		// ����һ������
		Collection books = new HashSet();
		books.add("Crazy Java");
		books.add("Python");
		books.add("Android");
		books.add("Python Coook book");
		// ʹ��Lambda���ʽ��Ŀ��������Predicate�����˼���
		books.removeIf(ele -> ((String) ele).length() < 10);
		System.out.println(books);
	}

	@Test
	public void predicateTest2() {
		// ����һ������
		Collection books = new HashSet();
		books.add("Crazy Java");
		books.add("Python");
		books.add("Android");
		books.add("Python Coook book");
		// ͳ����������������Ӵ���ͼ������
		System.out.println(calAll(books, ele -> ((String) ele).contains("Crazy")));
		System.out.println(calAll(books, ele -> ((String) ele).contains("Java")));
		System.out.println(calAll(books, ele -> ((String) ele).length() > 10));
	}

	public static int calAll(Collection books, Predicate p) {
		int total = 0;
		for (Object object : books) {
			if (p.test(object)) {
				total++;
			}
		}
		return total;
	}

	@Test
	public void precidateTest3() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("BC");

		System.out.println(list.size());
		System.out.println(list.get(2));

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next().toString();
			System.out.println(s);
		}
		list.remove("BC");
		System.out.println(list);
		Collection c = new HashSet();
		c.add("C");
		c.add("D");
		// ��list����֮�����c����
		list.addAll(c);
		System.out.println(list);
		// ��list�����е�ĳ��λ�ò�������һ���ϵ�ȫ��Ԫ��
		list.addAll(1, c);
		System.out.println(list);
	}

	@Test
	public void intStreamTest() {
		IntStream is = IntStream.builder().add(20).add(13).add(-2).add(-2).add(18).build();
		// ������þۼ������Ĵ���ÿ��ֻ��ִ��һ��
		//		System.out.println("is����Ԫ�ص����ֵ�� " + is.max().getAsInt());
		//		System.out.println("is����Ԫ�ص���Сֵ�� " + is.min().getAsInt());
		//		System.out.println("is����Ԫ�ص�������" + is.sum());
		//		System.out.println("is����Ԫ�ص�ƽ��ֵ��" + is.average());
		//		System.out.println("is����Ԫ�ص�ƽ��������20��" + is.allMatch(ele -> ele * ele > 20));
		//		System.out.println("is����Ԫ�ص�ƽ��������20��" + is.anyMatch(ele -> ele * ele > 20));
		
		//��isӳ���һ���µ�Stream����Stream��ÿһ��Ԫ�ض���ԭStream��2����1
//		IntStream newIs = is.map(ele -> ele*2+1);
		//ʹ�÷������õķ�������������Ԫ��
//		newIs.forEach(System.out::println);
		
		//filter ����Stream�����в�����predicate��Ԫ��
//		System.out.println(is.filter(ele -> ele>0).count());
		
		//�÷��������������������ظ���Ԫ�� ����ȥ�غ��Stream �Ƚ������������ ��һ�� �����ظ�Ԫ�� �ڶ��鲻�����ظ�Ԫ��
		is.forEach(System.out::println);
		is.distinct().forEach(System.out::println);
	}
	@Test
	public void collectionStream() {
		// ����һ������
		Collection books = new HashSet();
		books.add("Crazy Java");
		books.add("Python");
		books.add("Android");
		books.add("Python Coook book");
		
		//ͳ�ư�����Python���Ӵ���ͼ������
		System.out.println(books.stream().filter(ele -> (((String) ele).contains("Python"))).count());
		
		//ͳ�������ַ������ȴ���10��ͼ������
		System.out.println(books.stream().filter(ele -> ((String)ele).length()>10).count());
		
		//�ȵ���Collection�����stream()����������ת��ΪStream
		//�ٵ���Stream��mapToInt()������ȡԭ�е�Stream��Ӧ��IntStream
		
		books.stream().mapToInt(ele -> ((String)ele).length())
			//����forEach()��������IntStream�е�ÿһ��Ԫ��
			.forEach(System.out::println);;
	}
	
}
