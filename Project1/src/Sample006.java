/**
 * 간단한 계산기
 */

import java.util.Scanner;

/**
 * 
 */
public class Sample006 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요 ");
		int num1 = scanner.nextInt();
		System.out.println("두번째 숫자를 입력하세요 ");
		int num2 = scanner.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		int mod = num1 % num2;
		
		System.out.println("합은 " + sum);
		System.out.println("차는 " + sub);
		System.out.println("곱은 " + mul);
		System.out.println("나누면 " + div);
		System.out.println("나머지" + mod);
		
		

	}

}
