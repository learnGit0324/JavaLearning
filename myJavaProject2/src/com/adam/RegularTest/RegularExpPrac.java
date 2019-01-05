package com.adam.RegularTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

public class RegularExpPrac {
	private static final Logger log = Logger.getLogger(RegularExpPrac.class);
	public static final String PROPERTIES = "src/log4j-contrl.propertes";

	@Test
	public void regularTest1() {
		PropertyConfigurator.configure(PROPERTIES);
		String reg = "o+";
		Pattern p = Pattern.compile(reg);
		Matcher matcher = p.matcher("Fsoooood");
		log.info(matcher.matches());
		log.info(matcher.find());
		// 起始位置 是待匹配的字符在目标字符串中的索引位置
		log.info(matcher.start());
		// 结束位置 是待匹配的字符在目标字符串中的最后出现的位置
		log.info(matcher.end());
	}

	@Test
	public void regularTest2() {
		PropertyConfigurator.configure(PROPERTIES);
		String reg = "o+?";
		Pattern p = Pattern.compile(reg);
		Matcher matcher = p.matcher("oooooo");
		log.info(matcher.matches());
		// find的结果是false
		log.info(matcher.find());
		log.info(matcher.start());
		log.info(matcher.end());
	}

	@Test
	public void regularTest3() {
		PropertyConfigurator.configure(PROPERTIES);
		String str1 = "industry";
		String str2 = "industries";
		Matcher matcher = Pattern.compile("industr(?:y|ies)").matcher(str1);
		log.info(matcher.matches());
		matcher = Pattern.compile("industr(?:y|ies)").matcher(str2);
		log.info(matcher.matches());
		// 会比下面的方式更经济
		matcher = Pattern.compile("industry|industries").matcher(str1);
		log.info(matcher.matches());
	}

	@Test
	public void regulatTest4() {
		PropertyConfigurator.configure(PROPERTIES);
		String str = "apple";
		Matcher matcher = Pattern.compile("[abc]").matcher(str);
		// matches需要匹配整个字符串，而lookingAt则不需要匹配整个字符串
		log.info(matcher.matches());
		log.info(matcher.lookingAt());
		log.info(matcher.find());
		log.info(matcher.group());
	}

	@Test
	public void regularTest5() {
		PropertyConfigurator.configure(PROPERTIES);
		String reg = "dog";
		String str = "The dog says meow. All dogs say meow.";
		String repStr = "cat";
		Matcher matcher = Pattern.compile(reg).matcher(str);
		str = matcher.replaceAll(repStr);
		log.info(str);
	}

	@Test
	public void regularTest6() {
		PropertyConfigurator.configure(PROPERTIES);
		String regex = "a*b";
		String input = "aabfooaabfooabfoobkkk";
		String replace = "-";
		Pattern p = Pattern.compile(regex);
		Matcher matcher =p.matcher(input);
		StringBuffer sb = new StringBuffer();
		while(matcher.find()) {
			matcher.appendReplacement(sb, replace);
		}
		matcher.appendTail(sb);
		log.info(sb.toString());
	}
}
