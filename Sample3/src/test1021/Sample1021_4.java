/**
 * 
 */
package test1021;

/**
 * @author user
 *
 */
public class Sample1021_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//다차원 배열
		/*
		 * 출력결과) 번호 국어 영어 수학 총점 평균
		 * ==================================
		 * 			1 100 100 100 300 100.0
		 * 			2 20  20  20  60   20.0
		 * 			3 30  30  30  90   30.0
		 * 			4 40  40  40  120  40.0
		 * 			5 50  50  50  150  50.0 
		 *	==================================
		 *	총점: 240 240 240
		 */
		
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		int korT = 0, engT = 0 ,matT = 0;
		int i, j,sum = 0;
		double avg;
		
		System.out.println(" 번호  국어  영어  수학  총점  평균\r\n"
				+ "================================");
		
		for(i=0;i<score.length;i++)//score의 length는 행의 길이.
		{	sum = 0; //초기화 안해주면 다음 학생의 총점에 전 학생의 총점이 더해짐
		
			//국어 영어 수학은 각각 변하지 않는 위치가 있음.
			//국어 총점: 바뀌지 않는 것은 열, 앞은 변경되니까 i;과목별 합
			korT += score[i][0];
			//영어
			engT += score[i][1];
			//수학
			matT += score[i][2];
			
			//번호 찍기
			System.out.printf("%3d", i+1);//i가 0부터 시작하니까. 100까지 3자리가 있으니까 3d
			
			for(j=0;j<score[i].length;j++)
			{
				sum+= score[i][j]; //학생 각각의 총점.
				System.out.printf("%5d",score[i][j]);
			}
			
			avg = (double)sum/score[i].length;//score[i].length는 3임. 3으로 하드코딩을 하지 말고, 배열이 변경되었을 때를
											  //고려해서 .length로!
			System.out.printf("%5d %5.1f\n", sum, avg);
			
		}
		
		//System.out.println("================================\n"+"총점: "+" "+korT+"  "+engT+"  "+matT);
		System.out.println("================================");
		System.out.printf("총점: %3d %4d %4d", korT, engT, matT);
	
	
		/*
		 * 이렇게 해보자
		 * 번호	1		2		3		4		5		과목총점	
		 * 국어	100		20		30		40		50		240
		 * 영어	100		20		30		40		50		240
		 * 수학	100		20		30		40		50		240
		 * 총점	300		60		90		120		150
		 * 평균	100.0	20.0	30.0	40.0	50.0
		 * 
		 * 
		 * 배열 참고:
		 * 
		 * int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
			};
		*/
		
		
		
	}

}
