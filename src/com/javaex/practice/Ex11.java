package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	
	
	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ��� : ");
		
		Scanner pay = new Scanner(System.in);
		int worpay = pay.nextInt();
		pay.close();
		
		int nun = 10;
		int nunpay = worpay * 12 * nun;
		
		
		System.out.println(nun + "�⵿�� �ִ� ������� " + nunpay + "�Դϴ�");
		
	}
	
}
