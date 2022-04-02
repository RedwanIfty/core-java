package com.apj.annotations;

public class AnnotationTest {

    private int i;

    public AnnotationTest() {}
    public AnnotationTest(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        @MyAnno(message = "This is my message")
        int j = 10;
        this.i = i;
    }
}
