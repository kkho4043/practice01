package com.javaex.practice;

import java.util.Scanner;

public class Ex12{
	
	
	public static void main(String[] args) {
		System.out.print("�������� �Է��ϼ��� : ");
		
		Scanner rad = new Scanner(System.in);
		int radius = rad.nextInt();
		rad.close();

		final double PI = 3.14;
		double diameter = PI * radius * radius;
		
		
		
		System.out.println( "���� ���̴� " + Math.round(diameter * 100) / 100.0);
		
	}
	
}