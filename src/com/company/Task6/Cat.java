package com.company.Task6;

public class Cat implements Comparable<Cat> {

    int age;
    String name;

    Cat(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public int compareTo(Cat cat) {
        return age-cat.age;
    }
}
