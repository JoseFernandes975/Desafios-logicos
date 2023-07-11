package com.devfernandes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 int numbers;
		 
		 List<Integer> allNumbers = new ArrayList<>();
		 List<Integer> pairs = new ArrayList<>();
		 List<Integer> odds = new ArrayList<>();
		 
		 for(int i = 1; i <=n; i++) {
			 numbers = sc.nextInt();
			 allNumbers.add(numbers);
		 }
		 
		 for(int f: allNumbers) {
			 if((f)%2 == 0) {
				 pairs.add(f);
			 }
			 else {
				 odds.add(f);
			 }
		 }
		 
		 for(int x: pairs.stream().sorted().toList()) {
			 System.out.println(x);
		 }
		 
		 Collections.sort(odds, Collections.reverseOrder());
		 for(int y: odds) {
			 System.out.println(y);
		 }
		 

	}

}
