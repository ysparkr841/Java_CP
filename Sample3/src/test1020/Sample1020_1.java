/**
 * 
 */
package test1020;

/**
 * @author user
 *
 */
public class Sample1020_1 {

	/**
	 * 문제) 배열 score = {100,88,100,100,90} 초기화 되어 있는 배열의 값을 이용하여
	 *  총점과 평균을 구하는 프로그램
	 *  
	 *  출력예) 총점은 478
	 *  		평균은 95.6
	 */
	public static void main(String[] args) {
		int[] score = new int[] {100,88,100,100,90};
		//위에를 다르게 작성하면 int[] score = {100,88,100,100,90}; 으로도 가능.
		double avg;
		int i,sum = 0;
		for(i=0;i<score.length;i++) {
			sum += score[i];
		}
		//count가 필요가 없음. 결국 숫자의 수는 배열의 길이이기 때문.
		avg = (double)sum/score.length;
		System.out.printf("총점은 %d\n", sum);
		System.out.printf("평균은 %.1f\n", avg);
		
	}

}
