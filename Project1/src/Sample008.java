/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Sample008 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("돈을 투입하세요");
		int money = scan.nextInt();
		

		if (money >= 300) {
			System.out.println("커피 가능");
			int cup = money / 300;
			System.out.println("최대 " + cup + "잔 가능");
			int charge = money % 300;
			System.out.println("거스름돈" +  charge);
		} else {
			System.out.println("커피 불가");

		}

	}
}
