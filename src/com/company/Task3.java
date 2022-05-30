package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class Task3 {
    
    void function(Integer i) {
        i = 20;
        System.out.println("Integer = " + i);
    }
    
    void function(AtomicInteger i) {
        i.set(2000);
        System.out.println("AtomicInteger = " + i);
    }

    Task3() {
        Integer intVar = 10;
        AtomicInteger atomicVar = new AtomicInteger(1000);

        System.out.println("Before Function");
        System.out.println("Integer = " + intVar);
        System.out.println("AtomicInteger = " + atomicVar);

        System.out.println("In Function");
        function(intVar);
        function(atomicVar);

        System.out.println("After Function");
        System.out.println("Integer = " + intVar);
        System.out.println("AtomicInteger = " + atomicVar);
    }
}
