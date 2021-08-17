package com.company;

public class cwh_33_VarArgs {
    static int sum(int x,int ...arr){
        int result = x;
        for (int a: arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,3,4,5,6,7,8));
    }
}
