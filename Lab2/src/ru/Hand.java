package ru;

public class Hand {
    String color;
    int length;

    public Hand(String color, int length) {
        this.color = color;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "color='" + color + '\'' +
                ", length=" + length +
                '}';
    }

}
