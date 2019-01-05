package com.adam.RegularTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class RegexMatches {
	static Logger log = Logger.getLogger(RegexMatches.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("src/log4j-contrl.propertes");
		String line = "This order was placed for QT2000! OK?";
		String pattern ="(\\D*)(\\d*)(.*)"; 
		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher(line);
		if (matcher.find()) {
			// group中的数字 0,1,2,3表示使用哪一个括号里的表达式
			log.info(matcher.group(0));
			log.info(matcher.group(1));
			log.info(matcher.group(2));
			log.info(matcher.group(3));
		}else {
			log.info("NO MATCH");
		}
	}
	
}
