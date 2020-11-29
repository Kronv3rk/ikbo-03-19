package ru;

public class Head {
    String color;
    int eyes;

    public Head(String color, int eyes) {
        this.color = color;
        this.eyes = eyes;
    }

    @Override
    public String toString() {
        return "Head{" +
                "color='" + color + '\'' +
                ", eyes=" + eyes +
                '}';
    }
}
