package com.apj.generics;

public class GenTwo {

    Object obj; // Member variable

    public GenTwo(Object type) {
        this.obj = type;
    }

    public Object obj() {
        return obj;
    }

    public void show() {
        System.out.println(obj.getClass().getName());
    }
}
