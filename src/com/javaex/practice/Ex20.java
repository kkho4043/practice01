package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("500�� ���� : ");
		Scanner sc = new Scanner(System.in);
		int won500 = sc.nextInt();
		
		System.out.print("100�� ���� :");
		
		
		int won100 = sc.nextInt();
		System.out.print("50�� ���� :");
		
		
		int  won50 = sc.nextInt();
		System.out.print("10�� ���� :");
		
		
		int  won10 = sc.nextInt();
		sc.close();
		
		int all_500 = 500 * won500;
		int all_100 = 100 * won100;
		int all_50 = 50 * won50;
		int all_10 = 10 * won10;
		
		int all_plus = all_500+all_100+all_50+all_10;
		
		System.out.println("������ ������ " + all_plus + "�Դϴ�.");
	}

}
