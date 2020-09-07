package ru;

import ru.Furniture;

public class Chair extends Furniture{
int legcount;
Chair(String color, String name, int legcount){
  super(color, name);
  this.legcount=legcount;
}
public String toString(){
  return super.toString() + " " + legcount;
}

}
