package ru;

public class Planet implements Nameable{
   String name;
   Planet(String name){
     
     this.name=name;
     
   }
   @Override
   public String getName(){
     
     return name;
     
   }
   
    public String toString(){
     return getName();
   }
   
   
}
