package ru;

public class Car implements Nameable{
   String name;
   Car(String name){
     
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
