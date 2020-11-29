package ru.mirea.lab1;
import java.util.Scanner;

public class One {

    public static void main (String[]args){
        int i;
        int[] a=new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 10 чисел");

        for(i=0; i<10;i++){
            a[i]=sc.nextInt();
        }

        for(i=0; i<10;i++){
            System.out.println(a[i]);
        }
        i=0;
        while(i<10){
            System.out.println(a[i]);

            i++;
        }
        i=0;
        do{
            System.out.println(a[i]);
            i++;
        }while(i<10);

    }

}
