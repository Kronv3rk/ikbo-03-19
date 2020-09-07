package ru;

import ru.Dog;

public class Localdog extends Dog {
    String name;
    public Localdog(int pawquantity,String fcolor, String scolor,String name){
      super(pawquantity,fcolor,scolor);
      this.name=name;
    }
    public String toString(){
      return super.toString() + " " + name;
      
      
    }
}
