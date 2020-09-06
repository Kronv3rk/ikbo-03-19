package ru;

public class Leg {
    int quantity;

    public Leg(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "quantity=" + quantity +
                '}';
    }
}
