package com.company;

import java.util.ArrayList;

public class Task2 {
    Task2() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        int i = 0;          //List initialization
        while (++i<=10){
            Integer x = i;
            arrayList.add(x);
            arrayList.add(++i);
        }

        for (Integer x : arrayList) {       //Iteration on List
            int index = arrayList.indexOf(x);
            if((index&1)==0) {
                Integer i1 = arrayList.get(index);
                System.out.println(" Odd index with value "+i1);
            } else {
                int i2 = arrayList.get(index);
                System.out.println("Even index with value "+i2);
            };
        }
    }
}
