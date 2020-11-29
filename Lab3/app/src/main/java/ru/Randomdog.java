package ru;

import ru.Dog;

public class Randomdog extends Dog {
    String location;
    public Randomdog(int pawquantity,String fcolor, String scolor,String location){
      super(pawquantity,fcolor,scolor);
      this.location=location;
    }
    public String toString(){
      return super.toString() + " " + location;
      
      
    }
}
