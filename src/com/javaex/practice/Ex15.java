package com.javaex.practice;

import java.util.Scanner;

public class Ex15{
	
	
	public static void main(String[] args) {
		System.out.print("마일을 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		double mile = sc.nextDouble();
		
		final double MILE_TO_KILLO = 1.609;
		
		sc.close();
		
		double killo = MILE_TO_KILLO * mile;
		
		System.out.println(mile + "마일은  "+ killo + "킬로미터 입니다.");

		
		
	}
	
}