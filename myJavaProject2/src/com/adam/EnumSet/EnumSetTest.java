package comn.adam.EnumSet;

import java.util.EnumSet;

/**
 * @function EnumSet是一个专门为枚举类设计的集合类1，所有类型都必须是指定类型的枚举值，改枚举值类型在创建EnumSet是显示或引式地指定。
 * @author zhaoj
 *
 */
public class EnumSetTest {
	public static void main(String[] args) {
		//创建一个EnumSet集合， 集合元素就是Season枚举类的全部枚举值
		EnumSet es1 = EnumSet.allOf(Season.class);
		System.out.println(es1);
		//创建一个EnumSet空集合，指定其集合元素是Season类的枚举值
		EnumSet es2 = EnumSet.noneOf(Season.class);
		System.out.println(es2);
		//手动添加两个元素
		es2.add(Season.WINTER);
		es2.add(Season.SPRING);
		System.out.println(es2);
		//以指定枚举值创建EnumSet集合
		EnumSet es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
		System.out.println(es3);
		//对EnumSet集合元素排序
		EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
		System.out.println(es4);
		//complementof() 方法可以取补集
		EnumSet es5 = EnumSet.complementOf(es4);
		System.out.println(es5);
	}
}

enum Season{
	SPRING, SUMMER, FALL, WINTER
}