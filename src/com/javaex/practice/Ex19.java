package com.javaex.practice;

public class Ex19 {
	public static void main(String[] args) {
		final long light_speed = 300000;
		
		
		long light_m_speed = light_speed * 60;
		long light_s_speed = light_m_speed * 60;
		long light_d_speed = light_s_speed * 24;
		long light_nun_speed = light_d_speed * 365;

		System.out.println("���� 1�⵿�� �����̴� �Ÿ��� " + light_nun_speed +" �Դϴ�");
	}
}
