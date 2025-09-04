/**
 * Item을 상속한 Book클래스 생성 예제
 */

/**
 * @author Jiwon
 */
public class Sample003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Book book = new Book("IT", "책1", 10);
		System.out.println("카테고리:" + book.getType()
				+ " , 제목: " + book.getName()
				+ ", 수량: " + book.getQuantity());
		
	}

}
