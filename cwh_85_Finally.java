package com.company;

public class cwh_85_Finally {
    public static int greet(){
        try {
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is finally block");
        }
        return 0;
    }
    public static void main(String[] args) {

        int k = greet();
        System.out.println(k);

        int a = 7;
        int b = 9;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("This is finally for value of b "+ b);
            }
            b--;
        }

        //you can use only finally with try
        try {
            System.out.println(50/3);
        }
        finally {
            System.out.println("This is the actual finally");
        }
    }
}
