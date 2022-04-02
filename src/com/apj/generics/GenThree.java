package com.apj.generics;

public class GenThree<T, V> {
    T obj1; // Member variable
    V obj2;

    public GenThree(T type1, V type2) {
        obj1 = type1;
        obj2 = type2;
    }

    public void show() {
        System.out.println(obj1.getClass().getName());
        System.out.println(obj2.getClass().getName());
    }

}
