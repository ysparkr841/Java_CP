/**
 * 
 */
package test1015;

/**
 * @author user
 *
 */

import java.util.Scanner;
public class Sample1015 {

	/**
	 * 문제1) 정수를 입력받아서, 입력받은 정수가 0인 경우와 그렇지 않은 경우를 체크하는 프로그램 구현
	 * 입력: >5
	 * 0아님!
	 * 
	 * 입력: >0
	 * 0맞음!
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int inputN = sc.nextInt();
		if(inputN == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
		
		
	}

}
