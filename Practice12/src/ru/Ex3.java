package ru;

public class Ex3 {
    public static void main(String[] args) {
        Shirt[] shirts = {
                new Shirt("#1, Black Polo Shirt, Black, XL"),
                new Shirt("#2, Black Shirt, Black, L"),
                new Shirt("#3, Blue Polo Shirt, Blue, XL"),
                new Shirt("#4, Blue Polo Shirt, Blue, M"),
                new Shirt("#5, Cyan Shirt, Cyan, L"),
                new Shirt("#6, Black Shirt, Black, M"),
                new Shirt("#7, White Polo Shirt, White, XL"),
                new Shirt("#8, Violet Shirt, Violet, L"),
                new Shirt("#9, Green Shirt, Green, S"),
                new Shirt("#10, Orange Polo Shirt, Orange, S")
        };

        for (int i = 0; i < 10; i++) {
            System.out.println(shirts[i]);
        }

    }
}




