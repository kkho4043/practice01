package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	
	
	public static void main(String[] args) {
		System.out.print("월급을 입력하세요 : ");
		
		Scanner pay = new Scanner(System.in);
		int worpay = pay.nextInt();
		pay.close();
		
		int nun = 10;
		int nunpay = worpay * 12 * nun;
		
		
		System.out.println(nun + "년동안 최대 저축액은 " + nunpay + "입니다");
		
	}
	
}
