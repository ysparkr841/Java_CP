/**
 * 
 */
package prac1020;

/**
 * @author user
 *
 */
public class Prac1020_4 {

	/**
	 * 1. 배열에 저장된 값 중에서 최대값과 최소값을 구하는 프로그램.
   	힌트)int[] score = {79, 88, 91, 33, 100, 55, 95};
        int max = score[0];
        int min = score[0];
   
   	출력예) 최대값 : 100
          최소값 : 33
	 */
	public static void main(String[] args) {
		int[] score = new int[] {79,88,91,33,100,55,95};
		
		int max = score[0];
		int min = score[0];
		int i;
		for(i=0;i<score.length;i++) {
			if(score[i]>max) {
				max = score[i];
			}
			if(score[i]<min) {
				min = score[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}

}
