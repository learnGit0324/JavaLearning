package com.adam.Logging;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerL18N {

	public static void main(String[] args) throws Exception {
		//加载国际资源包
		ResourceBundle rb = ResourceBundle.getBundle("logMess",Locale.getDefault(Locale.Category.FORMAT));
		//获取System.Logger对象
//		System.Logger logger = System.getLogger("fkjava", rb);
		//设置系统日志级别
		Logger.getLogger("fkjava").setLevel(Level.INFO);
		//设置使用a.xml来保存日志记录
		Logger.getLogger("fkjava").addHandler(new FileHandler("a.xml"));
		//下面三个方法的第二个参数是国际化消息key
//		logger.log(System.Logger.Level.DEBUG, "debug");
//		logger.log(System.Logger.Level.INFO, "info");
//		logger.log(System.Logger.Level.ERROR, "error");
	}

}
