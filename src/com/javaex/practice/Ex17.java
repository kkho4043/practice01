package com.javaex.practice;

import java.util.Scanner;

public class Ex17{
	
	
	public static void main(String[] args) {
		System.out.print("구의 반지름 : ");
		
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextFloat();
		
		sc.close();
		
		final double PI = 3.14;
		final double GLOVE = PI * 4 / 3;
		
		double r3 = radius * radius * radius;
		
		System.out.println("구의 부피는 :" + r3 * GLOVE +" 입니다.");
		
		
	}
	
}