package comn.adam.EnumSet;

import java.util.EnumSet;

/**
 * @function EnumSet��һ��ר��Ϊö������Ƶļ�����1���������Ͷ�������ָ�����͵�ö��ֵ����ö��ֵ�����ڴ���EnumSet����ʾ����ʽ��ָ����
 * @author zhaoj
 *
 */
public class EnumSetTest {
	public static void main(String[] args) {
		//����һ��EnumSet���ϣ� ����Ԫ�ؾ���Seasonö�����ȫ��ö��ֵ
		EnumSet es1 = EnumSet.allOf(Season.class);
		System.out.println(es1);
		//����һ��EnumSet�ռ��ϣ�ָ���伯��Ԫ����Season���ö��ֵ
		EnumSet es2 = EnumSet.noneOf(Season.class);
		System.out.println(es2);
		//�ֶ��������Ԫ��
		es2.add(Season.WINTER);
		es2.add(Season.SPRING);
		System.out.println(es2);
		//��ָ��ö��ֵ����EnumSet����
		EnumSet es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
		System.out.println(es3);
		//��EnumSet����Ԫ������
		EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
		System.out.println(es4);
		//complementof() ��������ȡ����
		EnumSet es5 = EnumSet.complementOf(es4);
		System.out.println(es5);
	}
}

enum Season{
	SPRING, SUMMER, FALL, WINTER
}