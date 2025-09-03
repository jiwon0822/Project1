/**
 * 
 */

/**
 * @author Jiwon
 */
public class Sample005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Item item = new Item("아이템",1);
		
		Book book = new Book("IT", "책1", 1);
		Computer computer = new Computer("삼성", 256, "마이컴", 1);
		
		item = computer ;  // 큰 수가 작은 수를 받는 개념과 동일
		
//		System.out.println(item);
//		System.out.println(item.getType());
		if (item instanceof Book) {
			Book book2 =(Book)item; // 작은 수가 큰 수를 받기위해 명시적 캐스팅
			System.out.println(book2.getType());
			
		}
		
		else if (item instanceof Computer) {
			Computer computer2 = (Computer)item;
			System.out.println(computer2.getHdd());
			computer2.displayComputer("5561-8280");
			
			}
		

	}

}
