package com.javaex.practice;

import java.util.Scanner;

public class Ex14{
	
	
	public static void main(String[] args) {
		System.out.print("���θ� �Է��ϼ��� : ");
		
		Scanner sc = new Scanner(System.in);
		double width = sc.nextFloat();
		
		System.out.print("���θ� �Է��ϼ��� : ");
		double hight = sc.nextFloat();
		
		sc.close();
		double area = width * hight;
		double round = (width + hight) * 2;
		
		System.out.println( "�簢���� ���̴� "+ area);

		System.out.println( "�簢���� �ѷ��� " +round);
		
	}
	
}