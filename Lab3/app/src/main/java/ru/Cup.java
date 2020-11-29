package ru;

import ru.Dish;

public class Cup extends Dish{
    private float radius;
    Cup(int xsize, int ysize, int zsize, String name){
      super(xsize,ysize,zsize,name);
      radius = xsize/2;
    }
    public String toString(){
      return super.toString() +" " + radius;
    }
}
