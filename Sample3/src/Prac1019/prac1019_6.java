/**
 * 
 */
package Prac1019;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class prac1019_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		int sum=0, count =0;
		double avg;
		System.out.print("점수를 입력하세요.> ");
		while(true) {
			score = sc.nextInt();
			if(score == 0 ) break;
			sum+=score;
			count++;
		}
		avg = sum/(double)count;
		System.out.printf("입력된 값의 합계는 %d입니다.\n", sum);
		System.out.printf("입력된 값은 총 %d개 입니다.\n", count);
		System.out.printf("입력된 값의 평균은 %.4f입니다.\n", avg);
	}

}
