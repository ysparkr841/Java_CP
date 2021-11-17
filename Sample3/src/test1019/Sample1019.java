/**
 * 
 */
package test1019;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Sample1019 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*for(;;) {
			System.out.printf("%d\n", 0);
		} 이러면 무한반복*/
		//break와 continue는 break는 루프 빠져나가기
		//continue는 증감식으로 가서 증감하고 조건식 확인하고 반복
		
		//while은 한번도 실행 안할 수 있음:조건식이 거짓일 떄
		//while(조건식){내용}
		//do while은 한번은 실행하고 조건식 확인:조건식이 거짓이여도 한번은 실행.
		//do{내용} while(조건식)
		
		/*
		 * 문제:정수변수 num을 선언하고 1을 대입 후 1씩 증가시키면서 10까지 누적합을 구함.
		 * 	출력예: 1부터 10까지의 합= 55;
		 * 	 		while문이 끝난 후에 num의 값 = 11
		 **/
		
		
		int num = 1;
		int sum = 0;
		while(num<=10) {
			sum+=num;
			num++;	
		}
		System.out.printf("1부터 10까지의 합 = %d\n", sum);
		System.out.printf("while문이 끝난 후에 num의 값 = %d\n", num);	
	
		}
	}


