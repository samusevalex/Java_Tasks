package com.company.Task10;

import java.util.*;

public class Task10 {

    String str[] = {"abc", "cba", "Bca", "bca", "Abc", "ABc", "acb", "bca", "abc"};
    
    List<String> l = Arrays.asList(str);
    
    ArrayList<String> list = new ArrayList<>(l);
    HashSet  <String> hash = new HashSet  <>(l);
    TreeSet  <String> tree = new TreeSet  <>(l);
    
    /*                  Или так
    ArrayList<String> list = new ArrayList<>();     list.addAll(l);
    HashSet  <String> hash = new HashSet  <>();     hash.addAll(l);
    TreeSet  <String> tree = new TreeSet  <>();     tree.addAll(l);
    */
    
    /*                  Или так
    ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
    HashSet<String>   hash = new HashSet  <>(Arrays.asList(str));
    TreeSet<String>   tree = new TreeSet  <>(Arrays.asList(str));
    */
    void print(Iterator it) {
        while (it.hasNext())
            System.out.println(it.next());
    }

    HashSet<Hash> hash1 = new HashSet<>(
        List.of(
            new Hash(1,10,"Masha"),//hashCode = id, equals = age
            new Hash(1,20,"Kolya"),//Kolya has the same id with Masha, but different age. Present in the same bucket.
            new Hash(1,10,"Sasha") //Sasha has the same id and age with Masha. Is absent in List.
        )
    );

    TreeSet<Tree> tree1 = new TreeSet<>();        //Class Tree must be Comparable<>
    Tree t1 = new Tree(1,10,"Masha");
    Tree t2 = new Tree(2,20,"Fedya");   //Fedya is in Set. And Kolya is in Set
    Tree t3 = new Tree(3,20,"Kolya");   //But Fedya.equals(Kolya) -> true !!!

    public Task10() {
        System.out.print("HashSet ");
        System.out.println(hash1);

        System.out.print("TreeSet ");
        tree1.add(t1);tree1.add(t2);tree1.add(t3);
        System.out.println(tree1);
        System.out.print(t2.equals(t3));
        /*
        System.out.print("List of ArrayList ");
        System.out.println(list);
        print(list.iterator());

        System.out.print("List of HashSet ");
        System.out.println(hash);
        print(hash.iterator());

        System.out.print("List of TreeSet ");
        System.out.println(tree);
        print(tree.iterator());
        */

    }
}
