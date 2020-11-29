package ru;


public class Ex2 {
    public static void main(String[] args) {
        Address a = new Address("Russia, Center, Moscow, Tverskaya, 2, 2A, 54");
        System.out.println(a);
        a = new Address("Russia; Center; Moscow; Tverskaya; 2; 2A; 54", ";");
        System.out.println(a);
    }
}


