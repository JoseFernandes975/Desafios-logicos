package com.devfernandes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);  
		  
		  //qual par que a diferença entre eles dê 2
		  int list[] = { 1, 5, 3, 4, 2 };
	        
		  System.out.println("STDIN     FUNCTION");
		  System.out.println("------     -------------");
	        int size = sc.nextInt();
	        size = list.length;
	     
	        System.out.println(Counter.countPairs(list, size));
		  
	}

	
}
