/**
 * 
 */
package test1020;

/**
 * @author user
 *
 */
public class Sample1020_4 {

	/**
	 * 1. 배열에 저장된 값 중에서 최대값과 최소값을 구하는 프로그램.
   		힌트)int[] score = {79, 88, 91, 33, 100, 55, 95};
        	int max = score[0];
        	int min = score[0];
   
   		출력예) 최대값 : 100
          	  최소값 : 33
	 */
	public static void main(String[] args) {
		int[] score = {79,88,91,33,100,55,95};
		int max = score[0];
		int min = score[0];
		
		int i;
		//for문에서 i가 0번째일 필요가 없음. 자기 자신과 비교하는 것의 의미가 없음. 1번째 인덱스부터 비교하면 됨.
		for(i=1; i<score.length;i++) {
			if(score[i]>max) {
				max = score[i];
			}
			if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.printf("최대값 : %d\n", max);
		System.out.printf("최소값 : %d\n", min);
	}

}
