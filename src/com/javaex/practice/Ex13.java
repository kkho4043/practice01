package com.javaex.practice;

import java.util.Scanner;

public class Ex13{
	
	
	public static void main(String[] args) {
		System.out.print("ȯ���� ��ȭ�� �Է��ϼ��� : ");
		
		Scanner pay = new Scanner(System.in);
		float won = pay.nextInt();
		pay.close();

		final double dollar_per = 1230.95;
		double dollor = won / dollar_per;
		
		
		
		System.out.println( "������ �޷��� " +	dollor);
		
	}
	
}
