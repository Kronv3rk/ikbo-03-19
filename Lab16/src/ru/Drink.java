package ru;

 public final class Drink extends MenuItem implements Alcoholable {
     double alcoholVol;
     DrinkTypeEnum type;

     public Drink(double alcoholVol,DrinkTypeEnum type){
         this.alcoholVol = alcoholVol;
         this.type = type;
     }

     public DrinkTypeEnum getType() {
         return type;
     }

     @Override
     public boolean isAlcoholicDrink() {
         return type.isAlcohol();
     }

     @Override
     public double getAlcoholVol() {
         return alcoholVol;
     }

 }
