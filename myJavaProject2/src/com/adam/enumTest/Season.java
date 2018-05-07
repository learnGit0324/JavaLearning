package com.adam.enumTest;

public class Season {
	private Season(String name, String desc) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.desc = desc;
	}
	private final String name;
	private final String desc;
	public static final Season SPRING = new Season("����","��������");
	public static final Season SUMMER = new Season("����","��������");
	public static final Season FALL = new Season("����","�����ˬ");
	public static final Season WINTER = new Season("����","Χ¯��ѩ");
	public static Season getSeason(int seasonNum) {
		switch(seasonNum) {
		case 1:
			return SPRING;
		case 2:
			return SUMMER;
		case 3:
			return FALL;
		case 4:
			return WINTER;
		default:
			return null;
		}
		
	}
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	}
	public static void main(String[] args) {
		System.out.println(Season.SPRING.getName());
		System.out.println(SUMMER.getDesc());
	}
}
