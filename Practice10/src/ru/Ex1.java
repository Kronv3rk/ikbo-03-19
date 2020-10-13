package ru;

public class Ex1 {

    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        System.out.println("Комплексное число: " + factory.CreateComplex(5,10));
    }
}
