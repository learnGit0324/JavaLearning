package com.adam.Exception;

public class AuctionException extends Exception{
	//无参数的构造器
	public AuctionException(){};
	//一个带字符串参数的构造器
	public AuctionException(String str) {
		super(str);
	}
}
