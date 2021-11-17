package test1015;

import java.util.Scanner;

public class Sungjuk_professorVer {
	public static void main(String[] args) {
	int score = 0;
	char grade =' ', opt = '0';
	//변수를 두 개 잡았다는 것이 다름.
	System.out.print("점수: ");
	Scanner sc = new Scanner(System.in);
	
	score = sc.nextInt();
	
	System.out.printf("당신의 점수는 %d점 입니다. \n", score);
	
	if(score>= 90) {
			grade = 'A';
		if(score>=98) {
			opt = '+';
		}else if(score<=94) {
			opt = '-';
		}
		
	}else if(score>=80) {
		
		if(score>=88) {
			opt = '+';
		}else if(score<=84) {
			opt = '-';
		}
		
	}else {
		grade = 'C';
		opt = ' ';
	}
	System.out.printf("당신의 학점은 %c%c 입니다.", grade,opt);
	}
	
}
