package com.company;

public class cwh_34_Recursion {

    //1st Example:
 /*   static int factorail(int n){
        if (n==0 || n==1){
            return (1);
        }
        else {
            return (n*factorail(n-1));
        }
    }
    public static void main(String[] args) {
        int x=4;
        System.out.println(factorail(x));
    }*/

    //2nd Example: For Iterative factorial(1*2*3*5*6...)
    static int factorail_iterative(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i=1; i<=n; i++){
                product*=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x=4;
        System.out.println(factorail_iterative(x));
    }

}
