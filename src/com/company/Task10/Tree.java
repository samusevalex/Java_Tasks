package com.company.Task10;

public class Tree implements Comparable<Tree>{
    int id;
    int age;
    String name;

    Tree(int i, int a, String n){
        id=i;
        age=a;
        name=n;
    }

    @Override
    public int compareTo(Tree t){
        return id-t.id;
    }

    @Override
    public String toString(){
        return id+" "+age+" "+name;
    }
    @Override
    public boolean equals(Object obj) {
        Tree tree = (Tree)obj;
        return age == tree.age;
    }


}
