package ru;

final public class Drink implements Item {
    final private String name;
    final private double price;
    final private String description;
    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
        this.price = 0;
    }
    public Drink(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public String toString() {
        return "ru.Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
