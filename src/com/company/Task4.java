package com.company;

import java.util.Random;

public class Task4 {
    Task4 (){
        
        int i=10;
        Random random = new Random();
        int arr1[] = new int[i];
        int arr2[] = new int[i];
        
        while((i-=2)>=0) {              //Loop with decrement -2            
            arr1[i] = random.nextInt(9);
            arr1[i + 1] = random.nextInt(9);
            arr2[i] = random.nextInt(9);
            arr2[i + 1] = random.nextInt(9);
        }
        i = 10;
        while((i-=2)>=0) {
            int a1 = arr1[i];
            int a1n = arr1[i + 1];
            int a2 = arr2[i];
            int a2n = arr2[i];
            System.out.println(a1==a2 ? a1+" = "+a2 : (a1 > a2 ? a1+" > "+a2 : a1+" < "+a2));
            System.out.printf("%d%s%d\n", a1n, a1n==a2n ? " = " : (a1n > a2n ? " > " : " < "), a2n);
        }
    }
}
