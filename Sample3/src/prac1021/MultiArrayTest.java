/**
 * 
 */
package prac1021;

/**
 * @author user
 *
 */
public class MultiArrayTest {

	/**
	 * 성적
	 * =========================================
	 * 번호 국어 수학 영어 물리 화학 총점 평균
	 * 1	20	40	60	80	100
	 * 2	100 100 100 100 100
	 * 3	50	60	75	88	96
	 * 4	80	90	70	100	60
	 * 5	50	50	50	50	50
	 * 6	65	80	90	75	45
	 * =========================================
	 * 과목별 총점: 
	 */
	public static void main(String[] args) {
		int[][] score = {
				{20,40,60,80,100},
				{100,100,100,100,100},
				{50,60,75,88,96},
				{80,90,70,100,60},
				{50,50,50,50,50},
				{65,80,90,75,45}
		};
		
		int i, j, sum=0, korT=0, matT=0, engT=0, phyT=0, cheT=0;
		double avg;
		
		System.out.println("성적\r\n"
				+ "=========================================\r\n"
				+ "번호 국어 수학 영어 물리 화학 총점 평균");
		
		for(i=0;i<score.length;i++) 
		{	sum = 0;
			System.out.printf("%2d ", i+1);//번호는 1번부터 i는 0번부터 그래서 +1해줌
			for(j=0;j<score[i].length;j++) 
			{
				sum+= score[i][j];
				System.out.printf("%3d ", score[i][j]);
			}
			
			avg = (double)sum/score[i].length;
			System.out.printf("%3d %5.1f \n", sum, avg);
			
			korT += score[i][0];
			matT += score[i][1];
			engT += score[i][2];
			phyT += score[i][3];
			cheT += score[i][4];
		}
		
		System.out.println("==================================");
		System.out.printf("총점: %2d %4d %4d %4d %4d", korT, matT, engT, phyT, cheT);
	}

}
