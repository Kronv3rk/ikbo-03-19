package ru;

public abstract class Dish {

  private int xsize;
  private int ysize;
  private int zsize;
  private String name;
  
  Dish(int xsize, int ysize, int zsize, String name){
    this.xsize=xsize;
    this.ysize=ysize;
    this.zsize=zsize;
    this.name=name;
  }
  
  public int getXsize(){ return xsize;}
  public int getYsize(){ return ysize;}
  public int getZsize(){ return zsize;}
  public String getName(){return name;}
  
  public String toString(){
   return xsize +" " + ysize +" " + zsize +" " + name;
   
  }
  
  
}
