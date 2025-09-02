/**
 * 
 */

/**
 * 
 */
public class Sample010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[][] movies = new String[2][3];
		// 한국영화 3현
		movies[0][0] = "기생충";
		movies[0][1] = "미나리";
		movies[0][2] = "국제시장";
		
		//외국영화 3편
		movies[1][0] = "터미네이터";
		movies[1][1] = "아바타";
		movies[1][2] = "스파이더맨";
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(movies[i][j] + "\t");
			}
			System.out.println();
			
			}
		}
	}


