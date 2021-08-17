package com.company;

/**
 * This is my 107th class of code with Harry tutorial.
 */
public class cwh_107_MethodTags_JavaDocs {

    /**
     * Hello This is the description of a add method and contains following attributes.
     * @param i This is the first one integer
     * @param j This is the second one integer
     * @return This will show us our result.
     * @throws Exception Exception will be thrown if i is equal to zero.
     * @deprecated This method is depricated please use + operator.
     */
    public int add(int i ,int j)throws Exception{
        if (i==0){
            throw new Exception();
        }
        int c = i+j;
        return c;
    }

    public static void main(String[] args) {

    }
}
