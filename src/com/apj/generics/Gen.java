package com.apj.generics;

import java.io.Serializable;

public class Gen<T extends Number> {

    T[] obj; // Member variable

    public Gen(T[] type) {
        this.obj = type;
    }

    public T[] obj() {
        return obj;
    }

    public void show() {
        System.out.println(obj.getClass().getName());
    }

    public double average() {
        double sum = 0.0;
        for (int i = 0; i < obj.length; i++) {
            sum += obj[i].doubleValue();
        }
        return sum / obj.length;
    }

    public boolean hasSameAverage(Gen<?> p) {
        if (average() == p.average())
            return true;
        return false;
    }
}
