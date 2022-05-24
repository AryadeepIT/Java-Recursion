package com.aryadeep.strings;

import java.util.ArrayList;

public class AsciiReturn {
    public static void main(String[] args) {
        System.out.println(subseqAsciiReturn("", "abc"));

    }
    static ArrayList<String> subseqAsciiReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqAsciiReturn(p+ch, up.substring(1));
        ArrayList<String> second = subseqAsciiReturn(p, up.substring(1));
        ArrayList<String> third = subseqAsciiReturn(p + (ch + 0), up.substring(1));
        first.addAll(second);
        first.addAll(second);
        return first;
    }

}
