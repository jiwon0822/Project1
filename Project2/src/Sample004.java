/**
 * 상속 과제
 */

/**
 * @author Jiwon
 */
public class Sample004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer computer = new Computer("Samsung", 256, "DESKTOP-1UI1DS0", 1);
		System.out.println("제조사:" + computer.getMaker() + " , 하드용량: " + computer.getHdd() + " , 장치이름: "
				+ computer.getItem() + " , 수량: " + computer.getQuantity());
	}

}
