package ru;

import ru.Nameable;
import ru.Planet;
import ru.Car;


public class TestNameable {

  public static void main(String[] args) {
   
   Nameable planet = new Planet("Earth");
      Nameable car = new Car("TheCar");
      System.out.println(planet);
      System.out.println(car);
   
  }

}
