package ru;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println(" Магия ");
    }

    @Override
    public String toString() {

        return "Magic Chair";
    }
}