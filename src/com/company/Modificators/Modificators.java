package com.company.Modificators;

public class Modificators {
    public int pubVar=10;
    private int priVar=20;
    protected int proVar=30;
    int locVar=40;

    public int getPriVar(){
        return this.priVar;
    }
    public void setPriVar(int priVar){
        this.priVar=priVar;
    }
}
