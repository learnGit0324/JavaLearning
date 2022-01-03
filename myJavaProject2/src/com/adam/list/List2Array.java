package com.adam.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List2Array {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("str1");
        list.add("str2");
        System.out.println("the list:" + list);

        /* ��ͨ��toArray */
        /**
         * �����޷�ʹ��cast����Object����ת��
         */
        Object[] array = list.toArray();
        System.out.println("the array:" + Arrays.toString(array));
        System.out.println("array length is:" + array.length);

        /* ֧�ַ��͵�toArray */
        String[] strArray = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(strArray));
    }
}
