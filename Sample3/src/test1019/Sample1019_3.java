/**
 * 
 */
package test1019;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Sample1019_3 {

	/**
	 * 문제)(무한루프 사용!) 정수를 계속 입력받다가 0이 입력되면 0을 제외하고 이전에 입력된 자료의 수와 합계 평균을 출력하는 프로그램 작성
	 * 		(평균은 소수점 둘째자리까지 출력)
	 * 입력 예) 15 88 97 0
	 * 출력 예) 입력된 자료의 개수 = 3
	 * 			입력된 자료의 합계 =200
	 * 			입력된 자료의 평균 = 66.67	
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNum, sum =0, count =0;
		double avg = 0;
		//초기화는 while문 밖에 해줘야 함. while문 안에다 하면, sum값과 count값이 계속 초기화됨.
		System.out.print("숫자를 입력해주세요.(0입력 시 종료)> ");
		while(true) {
			inputNum = sc.nextInt();
			if(inputNum == 0) {
				break;
			}else {
				sum+= inputNum;
				count++;
			}
					}
		
		//형변환을 시키지 않으면, 소수점 뒤의 값을 잃어버림. (double)을 작성해줘야 함. 정수 나누기 정수는 정수로 나옴!
		avg = (double)sum/count;
		System.out.printf("입력된 자료의 개수 = %d\n", count);
		System.out.printf("입력된 자료의 합계 = %d\n", sum);
		System.out.printf("입력된 자료의 평균 = %.2f\n", avg);
		
		//교수님의 코드.
		sum=0; count=0; avg = 0;
		System.out.print("숫자를 입력해주세요.(0입력 시 종료)> ");
		while(true) {
			inputNum = sc.nextInt();
			if(inputNum == 0) break;
			sum+= inputNum;
			count++;
					}
		//avg를 반복문 안에 넣으면 불필요한 진행을 게속 해줌. 그래서 반복문 밖에 놓자.
		avg = (double) sum/count;
		System.out.printf("입력된 자료의 개수 = %d\n", count);
		System.out.printf("입력된 자료의 합계 = %d\n", sum);
		System.out.printf("입력된 자료의 평균 = %.2f\n", avg);
		
	} 
}
