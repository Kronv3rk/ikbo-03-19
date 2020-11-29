package ru;

import ru.Localdog;
import ru.Randomdog;


public class TestDog {

  public static void main(String[] args) {
    Localdog localdog = new Localdog(4,"white","black","Jeff");
    System.out.println(localdog);
    
     Randomdog randomdog = new Randomdog(4,"yellow","black","Russia");
    System.out.println(randomdog);
    
  }
  

}
