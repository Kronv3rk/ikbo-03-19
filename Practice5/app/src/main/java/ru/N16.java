package ru;

import java.util.*;

public class N16 {

	private void dow(int max, int q){
	  	  Scanner scanner = new Scanner(System.in);
	  int b =Integer.parseInt(scanner.nextLine());
	  if(b==0){
	  System.out.println(q);
	  return;
	  }
	  if(b==max)
	  q++;
	  if(b>max){
	    max=b;
	    q=1;
	  }
	  dow(max,q);
	
}

	N16(){
	  dow(0,0);
}

}
