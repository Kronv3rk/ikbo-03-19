package ru;

import java.io.*;
import java.util.Scanner;
public class FilesApp {
 public static void main(String[] args) {
 try(FileWriter writer = new 
FileWriter("C:\\SomeDir\\notes3.txt", false))
{
Scanner scanner = new Scanner(System.in);
String text = scanner.nextLine();
writer.write(text);
writer.append('\n');
writer.append('E');
 writer.flush();
 }
 catch(IOException ex){
 System.out.println(ex.getMessage());
 } 
 } 
}