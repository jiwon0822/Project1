
public class Book implements ItemStuff{ // Book은 Item을 상속한다
	
	private String type; // 책의 타입(만화책, 소설책...)
	private String item; // 아이템 이름(책1)
	private int quantity; // 수량(10권)
	
	
	public Book(String type, String item, int quantity) {
//		super(item, quantity); // 반드시 맨앞에 작성
		this.type = type;
		this.item = item;
		this.quantity = quantity;
		
		
	}
	
	// 타입에 대한 겟터 작성
	public String getType() {
		return type;
		
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return item;
	}
	
	
	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return 10;
	}
	
	@Override
	public void displayInfo() {
	System.out.println("책 카테고리: " + type + ", 제목: " +
	getName() + ", 수량: " + getQuantity());
	
		
	}
	
	@Override
		public String toString() {
			return "타입:" + type + ",이름:" + getName() +
					",수량:" + getQuantity();
			
		}

}
