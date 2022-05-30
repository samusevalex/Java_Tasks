package com.company.Task10;

public class Hash {
    int id;
    int age;
    String name;
    Hash(int i, int a, String n){
        id=i;
        age=a;
        name=n;
    }

    @Override
    public int hashCode(){
        return id;
    }

    @Override
    public boolean equals(Object obj){
        Hash sh = (Hash)obj;
        return age==sh.age;
    }

    @Override
    public String toString(){
        return id+" "+age+" "+name;
    }
}
