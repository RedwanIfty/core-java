package com.apj;

import com.apj.generics.Gen;
import com.apj.generics.GenThree;
import com.apj.generics.GenTwo;

public class Main {

    public static void main(String[] args) {
        Gen<Integer> g1 = new Gen<Integer>(new Integer[]{25, 25});
        Gen<Double> g2 = new Gen<Double>(new Double[]{24.5, 25.6});

        Gen<Integer> g3 = new Gen<Integer>(new Integer[]{25, 50});
        /*Gen<String> g3 = new Gen<String>(new String[]{"Hello Generics", "Hello World"});*/

//        g1.show();
//        g2.show();
//        /*g3.show();*/

        System.out.println(g1.average());
//        System.out.println(g2.average());
        /*System.out.println(g3.obj());*/
        System.out.println(g1.hasSameAverage(g2));

        GenThree<Integer, String> gen3 = new GenThree<Integer, String>(1, "Hello");
        gen3.show();
    }
}
