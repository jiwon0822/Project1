package com.baekseok;

import java.util.Scanner;

public class Sample006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = scan.nextInt();
		System.out.println("입력하신 나이는" + age);
		
	try {
		if (age < 19) {
			throw new IllegalAccessException(age + "세는 음주가능한 연령이 아닙니다.");
		}
		System.out.println("당신은 음주 가능합니다.");
		
	} catch (IllegalAccessException e) {
		System.out.println(e.getMessage());
	}
	}

}
