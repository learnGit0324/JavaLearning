package com.adam.chapter10;

public class FinallyFlowTest {
	/**
	 * ����������finally����ʹ��return��throw�ȵ��·�����ֹ�����
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
