package ru;

import java.util.ArrayList;
public class CollectionApp {
 public static void main(String[] args) {
 
 ArrayList<String> num = new ArrayList<String>();
 num.add("1");
 num.add("2");
 num.add("3");
 num.add("4");
 num.add(1, "5");
 System.out.println(num.get(1));
 num.set(1, "6");
 
 System.out.println("В списке "+num.size()+" элементов");
 for(String nums : num){
 
 System.out.println(nums);
 }
 System.out.print("\n");
 num.remove(0);
 
 Object[] numbers = num.toArray();
 for(Object number : numbers){
 
 System.out.println(number);
 }
 } 
}
