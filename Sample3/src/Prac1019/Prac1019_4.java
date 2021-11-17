/**
 * 
 */
package Prac1019;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Prac1019_4 {

	/**
	 ***
		 * 문제) 정수를 계속 입력받다가 0이 입력되면 입력된 수 중 홀수의 합과 평균을 출력하는 프로그램 작성
		 * 		전제: 전부 정수로 표시, 무한루프 사용(break와 continue를 사용)
		 * 입력예) 5 8 17 6 31 0
		 * 출력예) 홀수의 합 = 53
		 * 		홀수의 평균 = 17
		 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum = 0, count = 0;
		double avg;
		System.out.print("숫자를 입력해주세요.> ");
		while(true) {
			num = sc.nextInt();
			if(num == 0) break;
			if(num%2 ==0) continue;
			sum+=num;
			count++;
		}
		avg = (double)sum/count;
		
		System.out.printf("홀수의 합 = %d \n", sum);
		System.out.printf("홀수의 평균 = %.4f", avg);
	}

}
