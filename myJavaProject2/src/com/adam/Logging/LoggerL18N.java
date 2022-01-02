package com.adam.Logging;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerL18N {

	public static void main(String[] args) throws Exception {
		//���ع�����Դ��
		ResourceBundle rb = ResourceBundle.getBundle("logMess",Locale.getDefault(Locale.Category.FORMAT));
		//��ȡSystem.Logger����
//		System.Logger logger = System.getLogger("fkjava", rb);
		//����ϵͳ��־����
		Logger.getLogger("fkjava").setLevel(Level.INFO);
		//����ʹ��a.xml��������־��¼
		Logger.getLogger("fkjava").addHandler(new FileHandler("a.xml"));
		//�������������ĵڶ��������ǹ��ʻ���Ϣkey
//		logger.log(System.Logger.Level.DEBUG, "debug");
//		logger.log(System.Logger.Level.INFO, "info");
//		logger.log(System.Logger.Level.ERROR, "error");
	}

}
