/**
 * 
 */
package Prac1019;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Prac1019_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 *문제) 점수를 입력받아 90점 이상이면 당신의 성적은 'A'입니다. ....60점 아래면 'F'로 출력되고,
		 *		0~100점 이외의 점수가 입력되면 종료하는 프로그램
		 *
		 *예) 	점수를 입력하세요.> 50
		 *		당신의 성적은 'F'입니다.
		 *		점수를 입력하세요.> 95
		 *		당신의 성적은 'A'입니다.
		 *		점수를 입력하세요>101
		 *		(종료)
		 * 
		*/
		Scanner sc = new Scanner(System.in);
		for(;;) {
		System.out.print("점수를 입력하세요.> ");
		int score = sc.nextInt();
		if(score>100 || score<0) {break;}
		if(score>=90) {
			System.out.println("당신의 성적은 \'A\'입니다.");
			}
		else if(score>=80) {
			System.out.println("당신의 성적은 \'B\'입니다.");
		}
		else if(score>=70) {
			System.out.println("당신의 성적은 \'C\'입니다.");
		}
		else if(score>=60) {
			System.out.println("당신의 성적은 \'D\'입니다.");
		}
		else {
			System.out.println("당신의 성적은 \'F\'입니다.");
		}
		}
		
	}

}
