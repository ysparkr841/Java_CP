/**
 * 
 */
package test1019;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Sample1019_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 문제) 정수를 계속 입력받다가 0이 입력되면 입력된 수 중 홀수의 합과 평균을 출력하는 프로그램 작성
		 * 		전제: 전부 정수로 표시, 무한루프 사용(break와 continue를 사용)
		 * 입력예) 5 8 17 6 31 0
		 * 출력예) 홀수의 합 = 53
		 * 		홀수의 평균 = 17
		 * 
		 * self tip) 제외하는 것, 위의 문제에서는 짝수가 제외되는 항목을 continue로 빼주는 것이 좋음.
		 * 			이유는, 먼저 continue로 빼주면 아래 부분을 반복하지 않아도 되고, 따로 반복하는 영역을
		 * 			설정하지 않아도 되니까.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int num, sum = 0,count = 0, avg;
		System.out.print("숫자를 입력해주세요.> ");
		do {
			num = sc.nextInt();
			if(num%2 == 1) {
				sum+=num;
				count++;
			}
		}
		while(num != 0);
		avg = sum/count;
		
		System.out.printf("홀수의 합 = %d\n", sum);
		System.out.printf("홀수의 평균 = %d\n", avg);
	}

}
