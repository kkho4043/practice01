package com.javaex.practice;

import java.util.Scanner;

public class Ex15{
	
	
	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ��� : ");
		
		Scanner sc = new Scanner(System.in);
		double mile = sc.nextDouble();
		
		final double MILE_TO_KILLO = 1.609;
		
		sc.close();
		
		double killo = MILE_TO_KILLO * mile;
		
		System.out.println(mile + "������  "+ killo + "ų�ι��� �Դϴ�.");

		
		
	}
	
}