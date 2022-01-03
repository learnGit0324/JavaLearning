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
         * 1st 使用转换后的arr2List 创建一个新的newList才可以进行元素的添加
         */
        List<String> newList = new ArrayList<>(arr2List);
        System.out.println("the new list is:" + newList);
        newList.add("str4");
        System.out.println("the newList is:" + newList);
        /**
         * 2nd 使用Collections 将array的元素添加到新创建的newList2中 然后新的newList2才可以进行元素的添加
         */
        List<String> newList2 = new ArrayList<>(array.length);
        Collections.addAll(newList2, array);
        newList2.add("str5");
        System.out.println("the newList2 is:" + newList2);
    }
}
