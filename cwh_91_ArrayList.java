package com.company;
import java.util.ArrayList;
public class cwh_91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,7);
        l1.addAll(l2);
        l1.set(0,155);
        l1.ensureCapacity(4);

        //l1.clear();

        System.out.println(l1.contains(23));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        System.out.println(l1.get(4));


        l2.add(15);
        l2.add(18);
        l2.add(19);

        for (int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
