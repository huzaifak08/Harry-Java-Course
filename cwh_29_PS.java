package com.company;

public class cwh_29_PS {
    public static void main(String[] args) {
/*        //Problem 1
        float [] marks = {45.0f ,67.5f, 78.5f, 97.7f, 57.7f};
        float sum = 0;
        for (float element:marks){
            sum = sum+element;
        }
        System.out.println(sum);

        //Problem 2
        float [] marks = {45.0f ,67.5f, 78.5f, 97.7f, 57.7f};
        float num = 67.5f;
        boolean isinArray = false;

        for (float element: marks){
            if (num==element){
                isinArray=true;
                break;
            }
        }

        if (isinArray){
            System.out.println("num is present");
        }
        else {
            System.out.println("num is not present");
        }
        //problem 3
        float [] marks = {45.0f ,67.5f, 78.5f, 97.7f, 57.7f};
        float sum = 0;
        for (float element:marks){
            sum = sum+element;
        }
        System.out.println(sum/marks.length);
        */

        //Problem 4
        int mat1[][]={{3,4,5},
                {6,4,5}};
        int mat2[][]={{7,8,9},
                {2,6,9}};
        int result[][]={{0,0,0},
                {0,0,0}};
        for (int i=0; i<mat1.length; i++){
            for (int j=0; j<mat1[i].length; j++){
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j]= mat1[i][j]+mat2[i][j];
            }
        }
        for (int i=0; i<mat1.length; i++){
            for (int j=0; j<mat1[i].length; j++){
                System.out.print(result[i][j]+" ");
                result[i][j]= mat1[i][j]+mat2[i][j];
            }
            System.out.println(" ");
        }

    }
}
