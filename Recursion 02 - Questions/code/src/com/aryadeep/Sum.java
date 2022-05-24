package com.aryadeep;

public class Sum {
    public static void main(String[] args) {
        int ans = Sum(5); // 5 = 5 + 4 + 3 + 2 + 1
        System.out.println(ans);

    }
    static  int Sum(int n){
        if(n <= 1){
            return  1;
        }
        return  n + Sum(n-1);
    }
}
