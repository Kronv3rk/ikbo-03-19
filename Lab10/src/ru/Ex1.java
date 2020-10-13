package ru;

import java.util.*;

public class Ex1 {

    public static <E> ArrayList<E> convertAToL(E[] arr) {
        ArrayList<E> l = new ArrayList<E>();
        Collections.addAll(l, arr);
        return l;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {0,1,2,3};
        String[] arr2 = {"brrrr", "43341", "0_r"};
        ArrayList<Integer> a1 = convertAToL(arr1);
        ArrayList<String> a2 =  convertAToL(arr2);
        System.out.println(a1 + "\n" + a2);

    }
}
