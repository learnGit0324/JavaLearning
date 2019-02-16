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
	 * 遍历结果显示 iterator本身并不提供盛装对象的能力
	 */
	@Test
	public void iteratorTest1() {
		// 创建集合
		Collection books = new HashSet();
		books.add("Java");
		books.add("Python");
		books.add("Android");
		// 获取books集合对应的迭代器
		Iterator it = books.iterator();
		while (it.hasNext()) {
			// it.next()返回的数据类型是object类型， 因此需要进行类型转换
			String book = (String) it.next();
			System.out.println(book);
			if (book.equals("Andriod")) {
				it.remove();
			}
			// 对book变量赋值 不会改变集合元素本身
			book = "C++";
		}
		System.out.println(books);
	}

	/**
	 * 在集合遍历过程中 不要进行集合元素的添加删除等操作
	 */
	@Test
	public void iteratorTest2() {
		Collection books = new HashSet();
		books.add("Java");
		books.add("Python");
		books.add("Android");
		// 获取books集合对应的迭代器
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
		// 创建一个集合
		Collection books = new HashSet();
		books.add("Crazy Java");
		books.add("Python");
		books.add("Android");
		books.add("Python Coook book");
		// 使用Lambda表达式（目标类型是Predicate）过滤集合
		books.removeIf(ele -> ((String) ele).length() < 10);
		System.out.println(books);
	}

	@Test
	public void predicateTest2() {
		// 创建一个集合
		Collection books = new HashSet();
		books.add("Crazy Java");
		books.add("Python");
		books.add("Android");
		books.add("Python Coook book");
		// 统计书名包含“疯狂”子串的图书数量
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
		// 在list集合之后插入c集合
		list.addAll(c);
		System.out.println(list);
		// 在list集合中的某个位置插入另外一集合的全部元素
		list.addAll(1, c);
		System.out.println(list);
	}

	@Test
	public void intStreamTest() {
		IntStream is = IntStream.builder().add(20).add(13).add(-2).add(-2).add(18).build();
		// 下面调用聚集方法的代码每次只能执行一次
		//		System.out.println("is所有元素的最大值： " + is.max().getAsInt());
		//		System.out.println("is所有元素的最小值： " + is.min().getAsInt());
		//		System.out.println("is所有元素的总数：" + is.sum());
		//		System.out.println("is所有元素的平均值：" + is.average());
		//		System.out.println("is所有元素的平方都大于20：" + is.allMatch(ele -> ele * ele > 20));
		//		System.out.println("is所有元素的平方都大于20：" + is.anyMatch(ele -> ele * ele > 20));
		
		//将is映射秤一个新的Stream，新Stream的每一个元素都是原Stream的2倍加1
//		IntStream newIs = is.map(ele -> ele*2+1);
		//使用方法引用的方法来遍历集合元素
//		newIs.forEach(System.out::println);
		
		//filter 过滤Stream中所有不符合predicate的元素
//		System.out.println(is.filter(ele -> ele>0).count());
		
		//该方法用于排序六中所有重复的元素 返回去重后的Stream 比较下面的两组结果 第一组 包含重复元素 第二组不包含重复元素
		is.forEach(System.out::println);
		is.distinct().forEach(System.out::println);
	}
	@Test
	public void collectionStream() {
		// 创建一个集合
		Collection books = new HashSet();
		books.add("Crazy Java");
		books.add("Python");
		books.add("Android");
		books.add("Python Coook book");
		
		//统计包含”Python“子串的图书数量
		System.out.println(books.stream().filter(ele -> (((String) ele).contains("Python"))).count());
		
		//统计书名字符串长度大于10的图书数量
		System.out.println(books.stream().filter(ele -> ((String)ele).length()>10).count());
		
		//先调用Collection对象的stream()方法将几个转换为Stream
		//再调用Stream的mapToInt()方法获取原有的Stream对应的IntStream
		
		books.stream().mapToInt(ele -> ((String)ele).length())
			//调用forEach()方法遍历IntStream中的每一个元素
			.forEach(System.out::println);;
	}
	
}
