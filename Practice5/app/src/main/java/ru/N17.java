package ru;

import java.util.*;


public class N17 {
	private int dow(){
	  	  Scanner scanner = new Scanner(System.in);
	  int b =Integer.parseInt(scanner.nextLine());
	  if(b==0)
	  return 0;
	  int c=dow();
	  if(b>c)
	      return b;
	  else
	  	return c;
	
}
	N17(){
	  System.out.println(dow());
}
}
