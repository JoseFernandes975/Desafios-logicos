package com.devfernandes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String phrase = readLine(sc);
			StringBuilder part1 = new StringBuilder(phrase.substring(0, phrase.length() / 2));
			StringBuilder part2 = new StringBuilder(phrase.substring(phrase.length() / 2, phrase.length()));
			part1.reverse();
			part2.reverse();
			list.add(part1.toString() + part2.toString());
		}
		
		for(String x: list) {
			System.out.println(x);
		}
		
	}
	
	public static String readLine(Scanner sc) {
		String line = sc.nextLine();
		while (line.isEmpty())
			line = sc.nextLine();
		return line;
	}
	
	}

