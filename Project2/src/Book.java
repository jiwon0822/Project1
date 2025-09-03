
public class Book extends Item { // Book은 Item을 상속한다
	
	private String type; // 책의 타입(만화책, 소설책...)
	
	public Book(String type, String item, int quantity) {
		super(item, quantity); // 반드시 맨앞에 작성
		this.type = type;
		
	}
	
	// 타입에 대한 겟터 작성
	public String getType() {
		return type;
		
	}

}
