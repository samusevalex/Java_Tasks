package com.company.Task6;

import java.util.Comparator;

class CatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat c1, Cat с2) {
        return с2.age-c1.age;
    }
}
