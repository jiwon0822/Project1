package com.baekseok;

public class Sample005 {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		try {
		System.out.println(a /b);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누시면 안됩니다");
		} 
		finally {
		System.out.println("프로그램 종료");
		}
	
	}

}
