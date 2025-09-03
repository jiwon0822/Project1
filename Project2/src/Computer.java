
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
			

}
