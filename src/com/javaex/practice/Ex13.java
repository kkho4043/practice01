package com.javaex.practice;

import java.util.Scanner;

public class Ex13{
	
	
	public static void main(String[] args) {
		System.out.print("환전할 원화를 입력하세요 : ");
		
		Scanner pay = new Scanner(System.in);
		float won = pay.nextInt();
		pay.close();

		final double dollar_per = 1230.95;
		double dollor = won / dollar_per;
		
		
		
		System.out.println( "받으실 달러는 " +	dollor);
		
	}
	
}
