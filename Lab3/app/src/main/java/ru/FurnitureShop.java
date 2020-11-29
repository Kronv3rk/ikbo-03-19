package ru;

import ru.Chair;
import ru.Sofa;


public class FurnitureShop {

  public static void main(String[] args) {
    Chair chair = new Chair("красный","Стул",4);
    Sofa sofa = new Sofa("желтый","Диван","длинный");
    System.out.println(chair);
    System.out.println(sofa);
    
  }

}
