package com.javaex.practice;

import java.util.Scanner;

public class Ex16{
	
	
	public static void main(String[] args) {
		System.out.print("상품가격: ");
		
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		
		System.out.print("받은돈: ");
		double pay = sc.nextDouble();
		
		sc.close();
		
		System.out.println("=================");
		System.out.println("받은돈: " + pay);
		System.out.println("상품가격: " + price);
		
		final double VAT = 10;
		double balance = pay - price;
		
		System.out.println( "부가세 : "+ price / VAT);

		System.out.println( "잔액 : " + balance);
		
	}
	
}