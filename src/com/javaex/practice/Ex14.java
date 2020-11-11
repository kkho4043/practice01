package com.javaex.practice;

import java.util.Scanner;

public class Ex14{
	
	
	public static void main(String[] args) {
		System.out.print("가로를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		double width = sc.nextFloat();
		
		System.out.print("세로를 입력하세요 : ");
		double hight = sc.nextFloat();
		
		sc.close();
		double area = width * hight;
		double round = (width + hight) * 2;
		
		System.out.println( "사각형의 넓이는 "+ area);

		System.out.println( "사각형의 둘레는 " +round);
		
	}
	
}