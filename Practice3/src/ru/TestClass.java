package ru;

public class TestClass {

    public static void main(String[] args) {


        Shape s1 = new Circle("RED", false, 5.5); // Upcast
        System.out.println(s1); // вызван метод класса Circle
        System.out.println(s1.getArea()); //вызван метод класса Circle
        System.out.println(s1.getPerimeter()); //вызван метод класса Circle
        System.out.println(s1.getColor()); //  вызван метод класса Shape
        System.out.println(s1.isFilled()); //  вызван метод класса Shape
        //System.out.println(s1.getRadius()); // метод getRadius отсутвует в классе Shape


        Circle c1 = (Circle) s1; // Downcast
        System.out.println(c1); // вызван метод класса Circle
        System.out.println(c1.getArea()); //вызван метод класса Circle
        System.out.println(c1.getPerimeter()); //вызван метод класса Circle
        System.out.println(c1.getColor()); //вызван метод класса Shape
        System.out.println(c1.isFilled()); //вызван метод класса Shape
        System.out.println(c1.getRadius()); //вызван метод класса Circle

        //Shape s2 = new Shape(); // нельзя создать экземпляр абстрактного класса Shape


        Shape s3 = new Rectangle("RED", false, 1.0, 2.0); // Upcast
        System.out.println(s3); //  вызван метод класса Rectangle
        System.out.println(s3.getArea()); //  вызван метод класса Rectangle
        System.out.println(s3.getPerimeter()); //  вызван метод класса Rectangle
        System.out.println(s3.getColor()); //  вызван метод класса Shape
        //System.out.println(s3.getLength()); // метод getLength отсутвует в классе Shape


        Rectangle r1 = (Rectangle) s3; // Downcast
        System.out.println(r1); //  вызван метод класса Rectangle
        System.out.println(r1.getArea()); //  вызван метод класса Rectangle
        System.out.println(r1.getColor()); //  вызван метод класса Shape
        System.out.println(r1.getLength()); //  вызван метод класса Rectangle


        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4); //  вызван метод класса Square
        System.out.println(s4.getArea()); //  вызван метод класса Rectangle
        System.out.println(s4.getColor()); //  вызван метод класса Shape
        //System.out.println(s4.getSide()); // метод getSide отсутвует в классе Shape


        Rectangle r2 = (Rectangle) s4; // Downcast
        System.out.println(r2); //  вызван метод класса Square
        System.out.println(r2.getArea()); //  вызван метод класса Rectangle
        System.out.println(r2.getColor()); //  вызван метод класса Shape
        //System.out.println(r2.getSide()); // метод getSide отсутвует в классе Rectangle
        System.out.println(r2.getLength()); //  вызван метод класса Rectangle


        Square sq1 = (Square) r2; // Downcast
        System.out.println(sq1); //  вызван метод класса Square
        System.out.println(sq1.getArea()); //  вызван метод класса Rectangle
        System.out.println(sq1.getColor()); //  вызван метод класса Shape
        System.out.println(sq1.getSide()); //  вызван метод класса Square
        System.out.println(sq1.getLength()); //  вызван метод класса Rectangle
    }

}
