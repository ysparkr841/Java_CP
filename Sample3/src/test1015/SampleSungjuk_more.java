/**
 * 
 */
package test1015;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class SampleSungjuk_more {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.> ");
		int inputNum = sc.nextInt();
		MethodGather2 mg = new MethodGather2();
		String grade= mg.grade(inputNum);
		
		System.out.println("당신의 점수는 "+inputNum+"입니다.");
		System.out.println("당신의 학점은 "+grade+"입니다.");
	}

}

class MethodGather2{

	//A,B,C를 판단하는 메소드
	public String grade(int var) {
		String grade="";
		if(var>=90 && var<=100) {
			grade = "A";
			grade= this.gradePlusMinus(var, grade);
		}else if(var>=80 && var<90) {
			grade = "B";
			grade = this.gradePlusMinus2(var, grade);
		}else {
			grade = "C";
		}
		return grade;
	}
	
	//A 학점을 받은 학생의 구체적 학점 범위 판별하는 메소드
	public String gradePlusMinus(int var, String grade) {
		if(var>=98) {
			grade += "+";
		}else if(var>=90 && var<=94) {
			grade += "-";
		}else {
			grade += "0";
		}
		return grade;
	}
	
	//B 학점을 받은 학생의 구체적 학점 범위 판별하는 메소드
	public String gradePlusMinus2(int var, String grade) {
		if(var>=88) {
			grade += "+";
		}else if(var>=80 && var<=84) {
			grade += "-";
		}else {
			grade += "0";
		}
		return grade;
	}
}

