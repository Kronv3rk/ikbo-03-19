package ru;

public abstract class Dog {

    private int pawquantity;
    private String fcolor;
    private String scolor;
    
    public Dog(int pawquantity, String fcolor, String scolor){
      this.pawquantity= pawquantity;
      this.fcolor=fcolor;
      this.scolor=scolor;
    }
     public int getPawquantity(){ return pawquantity;}
  public String getFcolor(){ return fcolor;}
  public String getScolor(){ return scolor;}
  
    public String toString(){
   return pawquantity +" " + fcolor +" " + scolor;
   
  }
  

}
