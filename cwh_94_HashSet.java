package com.company;
import java.util.HashSet;

public class cwh_94_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> hs1 = new HashSet<>(6,0.5f);

        hs1.add(2);
        hs1.add(4);
        hs1.add(6);
        hs1.add(8);

        System.out.println(hs1);
    }
}
