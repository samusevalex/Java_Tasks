package com.company.Task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task6 {

    public Task6(){
        List<Cat> cat= new ArrayList<>(
                List.of(
                new Cat(30,"First"),
                new Cat(20,"Second"),
                new Cat(10,"Third"),
                new Cat(20,"Fourth"),
                new Cat(50,"Fifth")
                )
        );
        
//      cat.sort(Cat::compareTo);        
//      Arrays.sort(cat); Arrays.sort(cat, Comparator<? super Cat>);
        Collections.sort(cat);
        System.out.println("Ascending");
        for (Cat c: cat){
            System.out.println(c.age+"  "+c.name);
        }
        
        Collections.sort(cat,new CatComparator());
        System.out.println("Descending");
        for (Cat c: cat){
            System.out.println(c.age+"  "+c.name);
        }
    }
}
