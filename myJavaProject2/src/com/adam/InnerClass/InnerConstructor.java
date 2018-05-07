package com.adam.InnerClass;
/**
 * 在外部类以外的地方创建静态内部类的实例
 * @author zhaoj
 *
 */
public class InnerConstructor {
	public static void main(String[] args) {
		//静态内部类作为外部类的一个成员可以直接使用外部类名.内部类构造器进行创建实例
		StaticOut.StaticIn in = new StaticOut.StaticIn();
		//通过new关键字调用内部类构造器创建静态内部类变量
		new StaticOut.StaticIn();
	}
}
class StaticOut{
	//定义一个静态内部类，不适用访问控制符
	//即同一个宝中的其他类可以访问呢该内部类
	static class StaticIn{
		public StaticIn() {
			System.out.println("静态内部类的构造器");
		}
	}
}