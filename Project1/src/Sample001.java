
/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Sample001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 하나를 입력하세요?");
		int num = scanner.nextInt();
		System.out.println("당신이 입력하신 숫자는 " + num);
		
		System.out.println("당신의 시력은?");
		double eye = scanner.nextDouble();
		System.out.println("당신의 시력은 " + eye);
		
		scanner.nextLine(); // 숫자 다음에 문자열을 입력받을 땐 반드시 이 줄이 필요!
		
	
		System.out.println("가장 가고싶은 도시는?");
		String city = scanner.nextLine();
		System.out.println("가장 가고싶은 도시는 " + city);
		

	}

}
