package ru.mirea.prac1;

public class Ball {
    public static class ballprac{
        private  String color;
        private  int diameter;
        ballprac(String color,int diameter)
        {
            this.color = color;
            this.diameter = diameter;
        }
        public  void ToString()
        {
            System.out.println(color);
            System.out.println(diameter);
        }
    }

    public static void main (String[]args)
    {
        Ball.ballprac ball;
        ball = new Ball.ballprac("yellow", 10);
        ball.ToString();
    }
}
