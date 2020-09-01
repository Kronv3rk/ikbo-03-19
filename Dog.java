package ru.mirea.prac1;

public class Dog {

    public static class dogprac{
        private  String firstcolor;
        private  String secondcolor;
        dogprac(String firstcolor,String secondcolor)
        {
            this.firstcolor = firstcolor;
            this.secondcolor = secondcolor;
        }
        public  void ToString()
        {
            System.out.println(firstcolor);
            System.out.println(secondcolor);
        }
    }

    public static void main (String[]args)
    {
        dogprac doge;
        doge = new dogprac ("black", "white");
        doge.ToString();
    }

}
