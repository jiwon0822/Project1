
public class Computer extends Item {
	
	private String maker;
		private int hdd;
		
		public Computer(String maker, int hdd, String name, int quantity) {
			super(name, quantity);
			this.maker = maker;
			this.hdd = hdd;
			
		}
		
		public String getMaker() {
			return maker;
		}
		public int getHdd() {
			return hdd;
					

		}
		
		// 컴퓨터의 정보 출력
		public void displayComputer() {
			System.out.println("제조사:" + maker);
			System.out.println("하드용량:" + hdd);
		}
		
		// 전화번호 정보 출력
		public void displayComputer(String tel) {
			System.out.println("제조사:" +  maker);
			System.out.println("하드용량:" + hdd);
			System.out.println("전화번호:" + tel);
			
		}
		
		
		@Override
		public String toString() {
			return "제조사:" + maker + ",하드용량:" + hdd +
					",이름:" + getItem() + ",수량:" + getQuantity();
			
		}

}
