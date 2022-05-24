package com.aryadeep.strings;

public class SkipAppNotApple {
    public static void main(String[] args) {
        System.out.println(skipApple("bacapplcdah"));
    }
    static String skipApple(String up){
        if(up.isEmpty()){
            return  "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipApple(up.substring(3));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
}
