package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		
		System.out.print("ȭ�� : ");
		
		Scanner sc = new Scanner(System.in);
		double fi = sc.nextFloat();
		
		sc.close();
		
		
		System.out.println("ȭ�� "+ fi +" �� �����µ��� " +(double)5/9*(fi-32.0) + " �Դϴ�.");
		

		
	}
}
