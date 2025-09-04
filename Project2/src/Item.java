
public abstract class Item {

	private String item; // 아이템 이름(책1)
	private int quantity; // 수량(10권)
	
	// 생성자(Constructor)
	public Item(String item, int quantity) {
		this.item = item;
		this.quantity = quantity;
		
	}
	
	// 아이템에 대한 겟터
	public String getItem() {
		return item;
		
	}
	
	// 수량에 대한 겟터
	public int getQuantity() {
		return quantity;
		
	}
	
	// 정보 표시 (추상 메소드)
	public abstract void displayInfo();
	
	
	// toString 객체의 문자열 표현
	@Override
	public String toString() {
		return "이름:" + item + ", 수량:" + quantity;
		
	}
	
	
}

