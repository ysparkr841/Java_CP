/**
 * 
 */
package test1019;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Sample1019_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요.> ");
		int score = sc.nextInt();
		while(score>=0 && score<=100) {
			if(score>=80) {
				System.out.println("축하합니다. 합격입니다.");
			}else {
				System.out.println("죄송합니다. 불합격입니다.");
			}
			System.out.print("점수를 입력하세요.> ");
			score = sc.nextInt();
	}
		System.out.println("=============구분==============");
		//상단 문제 무한루프로 진행
		int score2;
		while(true) {
		System.out.print("점수를 입력하세요.> ");
		score2  =sc.nextInt();
		if(score2>100 || score2<0) {break;}
		else {
			if(score2>=80) {
				System.out.println("축하합니다. 합격입니다.");
			}else {
				System.out.println("죄송합니다. 불합격입니다.");
			}
		}
		}
		//불필요한게 너무 많은 것 같음. 다시해보자
		System.out.println("==============구분===============");
		//새로 변수 선언 안해도 위에 score를 초기화해서 사용하면 됨.
		score = 0;
		while(true) {
			System.out.print("점수를 입력하세요.> ");
			score  =sc.nextInt();
			if(score>=0 && score<=100) {
				if(score>=80) {
					System.out.println("축하합니다. 합격입니다.");
				}else {
					System.out.println("죄송합니다. 불합격입니다.");
				}
			}else {
				break;
			}
		}
		/*무한루프의 경우, 루프를 빠져나가는 break문에 부합하는 조건을 먼저 작성해주고 하단의 코드를 작성하는 것이 더 좋다고 함.
		* 
		*/
		
		//교수님이 하신 코드
		score = 0;
		System.out.print("점수를 입력하세요.> ");
		score=sc.nextInt();
		
		while(score>=0 && score<=100) {
			if(score>=80) {
				System.out.println("축하합니다. 합격입니다.");
			}else {
				System.out.println("죄송합니다. 불합격입니다.");
			}
			System.out.print("점수를 입력하세요.> ");
			score=sc.nextInt();
		}
		
		//무한루프
		score = 0;
		while(true) {
			System.out.print("점수를 입력하세요.> ");
			score=sc.nextInt();
			//넓은 범위부터 해주는 것이 좋음. 지금은 하나지만, 만약에 점수가 90점 80점 70점 60점의 분기점으로 구분한다면, 
			//먼저 break의 범위를 주는 것이 좋음. 왜냐? if, else if 부분에 들어갈 조건식이 줄어드니까.
			if(score>100 || score<0) {
				break;
			}
			if(score>=80) {
				System.out.println("축하합니다. 합격입니다.");
			}else {
				System.out.println("죄송합니다. 불합격입니다.");
			}
		}
		
		
	}
}
