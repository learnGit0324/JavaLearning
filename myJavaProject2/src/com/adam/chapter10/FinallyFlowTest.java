package com.adam.chapter10;

public class FinallyFlowTest {
	/**
	 * 尽量避免在finally块中使用return或throw等导致方法终止的语句
	 * @param args
	 */
	public static void main(String[] args) {
		boolean b = test();
		System.out.println(b);
	}

	@SuppressWarnings("finally")
	private static boolean test() {
		try {
			return true;
		} finally {
			return false;
		}
	}
}
