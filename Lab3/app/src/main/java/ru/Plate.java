package ru;

import ru.Dish;

public class Plate extends Dish{

    private String color;
    public Plate (int xsize, int ysize, int zsize, String name,String color){
      super(xsize,ysize,zsize,name);
      this.color=color;
      
    }
    
    public String toString(){
      return super.toString() +" " + color;
    }
}
