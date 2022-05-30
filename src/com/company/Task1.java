package com.company;

import com.company.Modificators.Modificators;

public class Task1 {
    Task1() {
        Modificators modificators = new Modificators();

        modificators.pubVar=100;     //correct

        //modificators.priVar=200;    incorrect
        modificators.setPriVar(200);
        int i = modificators.getPriVar();   //correct

        //modificators.proVar=300;    incorrect

        //modificators.locVar=400;    incorrect
    }
}
