package com.adam.BaseClass;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

public class VarargsDemo {
	private static final Logger log = Logger.getLogger(VarargsDemo.class);
	public static final String PROPERTIES = "src/log4j-contrl.propertes";

	@Test
	public void varargTest1() {
		PropertyConfigurator.configure(PROPERTIES);
		printMax(25,3,17,10);
	}

	private void printMax(int... numbers) {
		int result = numbers[0];
		if (numbers.length != 0) {
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] > result) {
					result = numbers[i];
				}
			}
		}
		log.info(result);
	}
}
