package com.apj.nested;

public class OuterClass {

    int i = 20;

    class InnerClass {
        int i = 10;

        public void print() {
            System.out.println("i: " + i);
            System.out.println("this.i: " + this.i);
            System.out.println("OuterClass.this.i: " + OuterClass.this.i);
        }
    }

    interface iA {
        void methodB();
    }

    public void methodA() {

        /*class LocalClass {
            int a;

            LocalClass(int a) {
                this.a = a;
            }

            int getA() {
                return a;
            }
        }*/

        iA obj = new iA() {
            @Override
            public void methodB() {
                System.out.println("Print Something");

            }

            public void methodC() {
                System.out.println("Print Something");
            }
        };

        iA obj1 = new iA() {
            @Override
            public void methodB() {
                System.out.println("Print Something 2");
            }
        };

        obj.methodB();
    }
}
