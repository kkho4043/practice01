package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		
		System.out.print("È­¾¾ : ");
		
		Scanner sc = new Scanner(System.in);
		double fi = sc.nextFloat();
		
		sc.close();
		
		
		System.out.println("È­¾¾ "+ fi +" ÀÇ ¼·¾¾¿Âµµ´Â " +(double)5/9*(fi-32.0) + " ÀÔ´Ï´Ù.");
		

		
	}
}
