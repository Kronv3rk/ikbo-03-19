package ru;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Item drink = new Drink(49, "Чай", "Черный / Зеленый");
        Item dish = new Dish(149, "Шаурма", "Курица, свинина, лаваш, специи");
        Order ord = new RestaurantOrder();
        ord.add(dish);
        ord.add(drink);
        System.out.println("Order1: " + Arrays.toString(ord.getArray()));
        drink = new Drink(200, "Кофе капучино", "Классический / Крепкий / Со льдом");
        dish = new Dish(650, "Пицца", " Сырная/пепперони");
        ord = new InternetOrder();
        ord.add(drink);
        ord.add(dish);
        System.out.println("Order2: " + Arrays.toString(ord.getArray()));
        System.out.println("Order2: " + ord.getSumPrice());
        System.out.println("Order2: " + Arrays.toString(ord.getArrayOfNames()));
        System.out.println("Order2: " + Arrays.toString(ord.getSortedArray()));
    }
}
