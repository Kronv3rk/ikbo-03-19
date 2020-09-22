package ru;

import java.util.Scanner;


public class N15 {
	private void dosom(int b){
	  System.out.println(b % 10);
	  if(b>9)
	  dosom(b/10);
	  
}

	N15(){
	  Scanner scanner = new Scanner(System.in);
	  int b =Integer.parseInt(scanner.nextLine());
	  dosom(b);
	} 
}
