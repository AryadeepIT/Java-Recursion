package com.aryadeep.strings;

import java.util.ArrayList;

public class SubSeqArrayList {
    public static void main(String[] args) {
//        subseqReturn("", "abc");
        System.out.println(subseqReturn("", "abc"));
    }
    static ArrayList<String> subseqReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqReturn(p+ch, up.substring(1));
        ArrayList<String> right = subseqReturn(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
