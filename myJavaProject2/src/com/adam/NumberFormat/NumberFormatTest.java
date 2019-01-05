package com.adam.NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
	/**
	 * MessageForamt抽象类是Format的子类，Format抽象类还有两个子类，分别是NumberFormat和DateFormat
	 * 都都包含了：
	 * format() 方法 将数值、日期格式化成字符串
	 * parse() 方法 将字符串解析成数值、日期
	 * @param args
	 */
	public static void main(String[] args) {
		double db = 1234000.567;
		//创建四个Locale，分别代表中 日 德 美
		Locale[] locales = new Locale[] {Locale.CHINA,Locale.JAPAN,Locale.GERMAN,Locale.US};
		NumberFormat[] nf = new NumberFormat[12];
		//为上面四个Locale创建12个NumberFormat对象
		//每一个Local分别有通用数值格式器、百分数格式器、货币格式器
		for (int i = 0; i < locales.length; i++) {
			nf[i*3] = NumberFormat.getNumberInstance(locales[i]);
			nf[i*3+1] = NumberFormat.getPercentInstance(locales[i]);
			nf[i*3+2] = NumberFormat.getCurrencyInstance(locales[i]);
		}
		for (int i = 0; i < locales.length; i++) {
			String tip = i == 0 ? "---中国的格式---":i == 1 ? "---日本的格式---" : i == 2 ? "---德国的格式---" : "---美国的格式---";
			System.out.println(tip);
			System.out.println("通用数值格式："+nf[i*3].format(db));
			System.out.println("百分比数值格式："+nf[i*3+1].format(db));
			System.out.println("货币数值格式："+nf[i*3+2].format(db));
		}
	}
}
