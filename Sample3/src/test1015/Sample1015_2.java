/**
 * 
 */
package test1015;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Sample1015_2 {

	/**
	 * @param args
	 * 문제: 점수 입력 받아, 90점 이상이면, A
	 * 		80이상 B
	 * 		나머지 C
	 * 		단, 98점 이상은, A+로 표시, 90~94: A-, 나머지 90점대는 A0
	 * 		80점도 마찬가지 89~88은 B+ 80~84 A-, 나머지는 B0
	 * 
	 * 		입출력 점수를 입력하세요: 100
	 * 		당신의 점수는 100점 입니다.
	 * 		당신의 학점은 A+입니다.
	 * 	
	 * 		85 , 85입니다. B0입니다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.> ");
		int inputNum = sc.nextInt();
		MethodGather mg = new MethodGather();
		String grade= mg.grade(inputNum);
		
		System.out.println("당신의 점수는 "+inputNum+"입니다.");
		System.out.println("당신의 학점은 "+grade+"입니다.");
	}

}

class MethodGather{

	public String grade(int var) {
		String grade="";
		if(var>=90 && var<=100) {
			if(var>=98) {
				grade = "A+";
			}else if(var>=90 && var<=94) {
				grade = "A-";
			}else {
				grade = "A0";
			}
			
		}else if(var>=80 && var<90) {
			if(var>=88) {
				grade = "B+";
			}else if(var>=80 && var<=84) {
				grade = "B-";
			}else {
				grade = "B0";
			}
		}else {
			grade = "C";
		}
		return grade;
	}
}
