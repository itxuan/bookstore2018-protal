package com.xzl.bookstore.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class DataUtil {

    public static List<Integer> setToList(Set<Integer> set){

        if(set == null){
            return null;
        }else {

            return Arrays.asList(set.toArray(new Integer[0]));
        }
    }

    public static List<Integer> stringsToList(String str){
        List<Integer> list = new ArrayList<>();
        if(str == null){
            return null;
        }
        String[] split = str.split(",");

        for(int i = 0;split != null && i<split.length;i++){

            String s = split[i];
            if(Integer.valueOf(s) <= Integer.MAX_VALUE) {
                list.add(Integer.valueOf(s));
            }
        }

        return list;
    }
}
