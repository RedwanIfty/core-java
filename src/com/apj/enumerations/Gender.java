package com.apj.enumerations;

public enum Gender {

    MALE(1, "M"), FEMALE(2, "F"), OTHERS(3, "O");

    private int id;
    private String name;

    Gender(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
