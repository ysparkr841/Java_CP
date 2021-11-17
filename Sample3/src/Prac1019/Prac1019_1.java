/**
 * 
 */
package Prac1019;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Prac1019_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * 문제:정수변수 num을 선언하고 1을 대입 후 1씩 증가시키면서 10까지 누적합을 구함.
		 * 	출력예: 1부터 10까지의 합= 55;
		 * 	 		while문이 끝난 후에 num의 값 = 11
		 * do while문으로 해보기!
		 **/
		
		int num =1, sum = 0;
		do {
			sum+=num;
			num++;
		}
		while(num<=10);
		
		System.out.printf("1부터 10까지의 합 = %d\n", sum);
		System.out.printf("while문이 끝난 후에 num의 값 = %d\n", num);
		
		
		System.out.println("========구분선===============");
		
		/*
		 *문제) 점수를 입력받아 80점 이상이면 합격메시지를 그렇지 않으면 불합격 메시지를 출력하는 작업을 반복하다가
		 *		0~100점 이외의 점수가 입력되면 종료하는 프로그램
		 *
		 *예) 	점수를 입력하세요.> 50
		 *		죄송합니다. 불합격입니다.
		 *		점수를 입력하세요.> 95
		 *		축하합니다. 합격입니다.
		 *		점수를 입력하세요>101
		 *		(종료)
		 *		
		*/
		
		int inputNum;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("점수를 입력해주세요.> ");
			inputNum = sc.nextInt();
			if(inputNum>100 || inputNum<0) break;
			if(inputNum>=80) {
				System.out.println("축하합니다. 합격입니다.");
			}else {
				System.out.println("죄송합니다. 불합격입니다.");
			}		
		}
		
		System.out.println("========구분선===============");
		
		
		/**
		 * 문제)(무한루프 사용!) 정수를 계속 입력받다가 0이 입력되면 0을 제외하고 이전에 입력된 자료의 수와 합계 평균을 출력하는 프로그램 작성
		 * 		(평균은 소수점 둘째자리까지 출력)
		 * 입력 예) 15 88 97 0
		 * 출력 예) 입력된 자료의 개수 = 3
		 * 			입력된 자료의 합계 =200
		 * 			입력된 자료의 평균 = 66.67	
		 */
		
		int count = 0;
		double avg;
		sum = 0;
		System.out.printf("점수를 입력하세요.> ");
		while(true) {
			inputNum = sc.nextInt();
			if(inputNum == 0) break;
			sum += inputNum;
			count++;
		}
		avg = sum/(double)count;
		System.out.printf("입력된 자료의 개수 = %d \n", count);
		System.out.printf("입력된 자료의 합계 = %d\n", sum);
		System.out.printf("입력된 자료의 평균(소수점 뒤 두번째 자리까지) = %.2f\n", avg);
		
		System.out.println("========구분선===============");
		
		/**
		 * 문제) 정수를 계속 입력받다가 0이 입력되면 입력된 수 중 홀수의 합과 평균을 출력하는 프로그램 작성
		 * 		전제: 전부 정수로 표시, 무한루프 사용(break와 continue를 사용)
		 * 입력예) 5 8 17 6 31 0
		 * 출력예) 홀수의 합 = 53
		 * 		홀수의 평균 = 17
		 */
		
		sum = 0; count = 0;
		int avg2;
		
		System.out.print("숫자를 입력하세요.> ");
		while(true) {
			inputNum = sc.nextInt();
			if(inputNum == 0) break;
			if(inputNum%2 ==0) continue;
			sum += inputNum;
			count++;
		}
		avg2 = sum/count;
		System.out.printf("홀수의 합 = %d \n", sum);
		System.out.printf("홀수의 평균 = %d\n", avg2);
	}
	
		

}
