package ru.mirea.lab1;
import java.util.Scanner;
public class Five {
    public static void main (String[]args){
        int i,n,res=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            res=res*(i+1);
        }
        System.out.println("Факториал:"+res);
    }
}
