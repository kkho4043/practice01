package com.javaex.practice;

import java.util.Scanner;

public class Ex16{
	
	
	public static void main(String[] args) {
		System.out.print("��ǰ����: ");
		
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		
		System.out.print("������: ");
		double pay = sc.nextDouble();
		
		sc.close();
		
		System.out.println("=================");
		System.out.println("������: " + pay);
		System.out.println("��ǰ����: " + price);
		
		final double VAT = 10;
		double balance = pay - price;
		
		System.out.println( "�ΰ��� : "+ price / VAT);

		System.out.println( "�ܾ� : " + balance);
		
	}
	
}