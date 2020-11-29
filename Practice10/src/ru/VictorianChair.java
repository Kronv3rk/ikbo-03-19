package ru;

public class VictorianChair implements Chair {
    int age;

    public int getAge() {

        return age;
    }
    public VictorianChair(int age) {

        this.age = age;
    }

    @Override
    public String toString() {

        return "Victorian Chair";
    }
}
