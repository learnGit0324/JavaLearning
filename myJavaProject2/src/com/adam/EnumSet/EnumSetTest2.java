package comn.adam.EnumSet;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

public class EnumSetTest2 {
	public static void main(String[] args) {
		Collection c = new HashSet();
		c.clear();
		c.add(Season.FALL);
		c.add(Season.SPRING);
		//复制集合Collection的所有元素来创建EnumSet集合
		EnumSet enumSet = EnumSet.copyOf(c);
		System.out.println(enumSet);
		c.add("Java");
		//下面的代码出现异常，因为c集合的元素不全都是枚举值
		enumSet = EnumSet.copyOf(c);
	}
}
