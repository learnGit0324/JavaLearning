package com.adam.enumTest;

public class GenderTest {
	public static void main(String[] args) {
		//ͨ��Enum.valueOf����ȡָ��ö�����ö��ֵ
		Gender g = Enum.valueOf(Gender.class, "FEMALE");
		//ֱ��Ϊö��ֵ��nameʵ��������ֵ
		g.name = "Ů";
		System.out.println(g+"����:"+g.name);
		g.setName("��"); //������ʾ��������  ���齫ö��������Ϊ���ɱ��࣬Ҳ����˵���ĳ�Ա����ֵ�������ı�
		System.out.println(g+"����"+g.name);
		Gender3 g3 = Gender3.FEMALE;
		g3.test();
	}
}
