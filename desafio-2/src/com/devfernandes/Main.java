package com.devfernandes;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	

		double value = sc.nextDouble();

		int grades = (int) value;
		int coins = (int) ((value - grades) * 100);
		
		int grades100 = grades / 100;
		grades -= grades100 * 100;
		
		int grades50 = grades / 50;
		grades -= grades50 * 50;
		
		int grades20 = grades / 20;
		grades -= grades20 * 20;
		
		int grades10 = grades / 10;
		grades -= grades10 * 10;
		
		int grades5 = grades / 5;
		grades -= grades5 * 5;
		
		int grades2 = grades / 2;
		grades -= grades2 * 2;
		
		int coins1 = grades;
		grades -= coins1 * 1;
		
		int coins50 = coins / 50;
		coins -= coins50 * 50;
		
		int coins25 = coins / 25;
		coins -= coins25 * 25;
		
		int coins10 = coins / 10;
		coins -= coins10 * 10;
		
		int coins05 = coins / 5;
		coins -= coins05 * 5;
		
		int coins01 = coins;

		System.out.println("NOTAS:");
		System.out.println(grades100 + " nota(s) de R$ 100.00");
		System.out.println(grades50 + " nota(s) de R$ 50.00");
		System.out.println(grades20 + " nota(s) de R$ 20.00");
		System.out.println(grades10 + " nota(s) de R$ 10.00");
		System.out.println(grades5 + " nota(s) de R$ 5.00");
		System.out.println(grades2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(coins1 + " moeda(s) de R$ 1.00");
		System.out.println(coins50 + " moeda(s) de R$ 0.50");
		System.out.println(coins25 + " moeda(s) de R$ 0.25");
		System.out.println(coins10 + " moeda(s) de R$ 0.10");
		System.out.println(coins05 + " moeda(s) de R$ 0.05");
		System.out.println(coins01 + " moeda(s) de R$ 0.01");

	}
}
