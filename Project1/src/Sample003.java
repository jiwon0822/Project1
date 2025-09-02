/**
 * 
 */

/**
 * 
 */
public class Sample003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 묵시적 형변환
		// 큰수와 작은수에서 작은수는 큰수로 받을 수 있다.\
		int i = 100;
		long l = i;
		System.out.println("l = " + i);
		
		// 명시적 형변환(난리 친다!)
		// 실수를 정수로 받고 싶을 때
		int j = (int)3.14;
		System.out.println("j = " + j);
		
		// 정수와 실수의 연산은 실수로 묵시적 형변환
		// +, -, *, /
		System.out.println(100 / (double)3);
		

	}

}
