package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}

public class cwh_84_Throws {

    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }

    public static float divide(int a, int b) throws ArithmeticException{

        //again view this portion in Harrys video notes (its little bit changed)

        if (b==0){
            throw new ArithmeticException("Not Possible");
        }
        float result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
            float c = divide(3,2);
            System.out.println(c);

            double a = area(3);
            System.out.println(a);
        }
        catch (Exception e){
            System.out.println("Exception");
        }

    }
}
