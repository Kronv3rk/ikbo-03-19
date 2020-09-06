package ru;

public class Circle {
    private int radius;
    private String color;
    private String name;

    public Circle(int radius, String color, String name) {
        this.radius = radius;
        this.color = color;
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
