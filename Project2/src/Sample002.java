/**
 *  ArrayList를 생성하고 추가하는 에제
 */

import java.util.ArrayList;

/**
 * @author Jiwon
 */
public class Sample002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> books = new ArrayList<String>();
		books.add("엄마의 말뚝");
		books.add("채식주의자");
		books.add("아몬드");
		
		for (String book : books) {
			System.out.println(book);
		
		}
	}

}
