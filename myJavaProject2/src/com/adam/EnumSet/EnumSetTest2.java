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
		//���Ƽ���Collection������Ԫ��������EnumSet����
		EnumSet enumSet = EnumSet.copyOf(c);
		System.out.println(enumSet);
		c.add("Java");
		//����Ĵ�������쳣����Ϊc���ϵ�Ԫ�ز�ȫ����ö��ֵ
		enumSet = EnumSet.copyOf(c);
	}
}
