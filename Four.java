package ru.mirea.lab1;

import java.math.*;

public class Four {
    public static void bubbleSort(int[] arr){

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j=0;j<i; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}
    public static void main (String[]args){
    int i;
    int[] a=new int[10];

    for(i=0; i<10;i++){
        a[i]=(int)(Math.random()*10);
        System.out.println(a[i]);
    }
    bubbleSort(a);
    for(i=0; i<10;i++){

        System.out.println(a[i]);
    }

}

}
