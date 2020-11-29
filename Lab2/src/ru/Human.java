package ru;

import ru.Hand;
import ru.Head;
import ru.Leg;

public class Human {
    Hand hand;
    Head head;
    Leg leg;

    public Human(String color0, int length, String color, int eyes,int quantity) {
        this.hand = new Hand(color0,length);
        this.head = new Head(color,eyes);
        this.leg = new Leg(quantity);
    }

    @Override
    public String toString() {
        return "Human{" +
                "hand=" + hand.toString() +
                ", head=" + head.toString()  +
                ", leg=" + leg.toString()  +
                '}';
    }
}
