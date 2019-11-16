package com.adam.Exception;

public class AuctionTest {
	private double intPrice = 30.0;
	
	public static void main(String[] args) {
		AuctionTest at = new AuctionTest();
		try {
			at.bid("df");
		} catch (AuctionException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	private void bid(String string) throws AuctionException {
		double d = 0.0;
		try {
		d = Double.parseDouble(string);
		}catch (Exception e) {
			// TODO: handle exception
			throw new AuctionException("���ļ۱��������������ܰ��������ַ���");
		}
		if (intPrice > d) {
			throw new AuctionException("���ļ۲��ܱȳ�ʼ�۸�͡�");
		}
	}
}
