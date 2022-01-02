package com.adam.ArraysTest;

import java.util.*;

public class ArraysTest {
    private static final int MIN_ARRAY_SORT_GRAN = 1 << 13;

    public static void main(String[] args) {
        String[] strArr = new String[]{};
        System.out.println(strArr.length);

        strArr = new String[]{"a", "b", "c"};
		System.out.println(strArr.length);

        System.out.println(strArr[1]);

        String[] strClone = strArr.clone();
        System.out.println(Arrays.toString(strClone));

        /* how about the array minimum and maximum length*/
        System.out.println(MIN_ARRAY_SORT_GRAN);  //8192

        String str = String.format("%05d",1);
        System.out.println(str);

        List<String> list =  new ArrayList<>();

        for (int i=0; i <5; i++){
            list.add("a"+String.format("%05d",i));
        }
        Object[] list2Arr = list.toArray();
        System.out.println(list2Arr.length);
        System.out.println(Arrays.toString(list2Arr));
        Arrays.sort(list2Arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(list2Arr));
    }
}
