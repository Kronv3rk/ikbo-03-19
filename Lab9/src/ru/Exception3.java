package ru;

import java.util.Scanner;

public class Exception3 {

    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.nextLine();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NullPointerException ex) {
            System.err.println("Enter an integer ");
        } finally {
            System.err.println("Bruh");
        }
    }
    }
    public static void main(String[] args){
        new Exception3().exceptionDemo();
    }
}
