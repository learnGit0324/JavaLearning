package com.adam.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array2List {
    public static void main(String[] args) {
        String[] array = new String[3];
        array[0] = "str1";
        array[1] = "str2";
        array[2] = "str3";
        System.out.println("the array is:" + Arrays.toString(array));

        List<String> arr2List = Arrays.asList(array);
        System.out.println("the arr2List is:" + arr2List);
        /* arr2List doesn't support add function */
//        arr2List.add("str4");
        /**
         * 1st ʹ��ת�����arr2List ����һ���µ�newList�ſ��Խ���Ԫ�ص����
         */
        List<String> newList = new ArrayList<>(arr2List);
        System.out.println("the new list is:" + newList);
        newList.add("str4");
        System.out.println("the newList is:" + newList);
        /**
         * 2nd ʹ��Collections ��array��Ԫ����ӵ��´�����newList2�� Ȼ���µ�newList2�ſ��Խ���Ԫ�ص����
         */
        List<String> newList2 = new ArrayList<>(array.length);
        Collections.addAll(newList2, array);
        newList2.add("str5");
        System.out.println("the newList2 is:" + newList2);
    }
}
