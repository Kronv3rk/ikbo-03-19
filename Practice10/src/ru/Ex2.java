package ru;

public class Ex2 {
    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Client client = new Client();
        System.out.println("1.\t" + factory.createVictorianChair());
        System.out.println("2.\t" + factory.createMagicChair());
        System.out.println("3.\t" + factory.createFunctionalChair());
        client.setChair(factory.createVictorianChair());
        client.sit();
        client.setChair(factory.createMagicChair());
        client.sit();
        client.setChair(factory.createFunctionalChair());
        client.sit();


    }
}
