/**
 * For문
 */

/**
 * 
 */
public class Sample009 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String[] movies = {
//				"One day", "F1"
//		};
		
		String[] movies = new String[2]; // 2편의 영화 배열 생성
		movies[0] = "One day";
		movies[1] = "F1" ;
		
		
		for (int i = 0; i < 2; i++) {
			System.out.println(movies[i]);
			
			
		}
		
		for (String m : movies) {
			System.out.println(m);
			
		}
 
	}

}
