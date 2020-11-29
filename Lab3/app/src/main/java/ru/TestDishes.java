package ru;

import ru.Cup;

public class TestDishes {

  public static void main(String[] args) {
    Cup cup = new Cup(4,4,5,"Чашка");
    Plate plate = new Plate (6,4,2,"Plate","red");
    System.out.println(cup.toString());
    System.out.println(plate.toString());
  }

}
