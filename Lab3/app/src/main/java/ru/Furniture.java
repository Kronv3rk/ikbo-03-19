package ru;

public class Furniture {
   String color;
   String name;
   Furniture(String color,String name){
     this.color=color;
     this.name=name;
   }
   public String getColor(){return color;}
   public String getName(){return name;}
   public String toString(){
     return color + " " + name;
   }
}
