package ru;

public class Sofa extends Furniture{
    String length;
    Sofa(String color, String name,String length){
      super(color,name);
      this.length=length;
    }
    public String toString(){
      return super.toString() + " " + length;
    }


}
