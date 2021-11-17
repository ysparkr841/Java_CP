package prac1027;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsTestSelf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try 
		{
			System.out.print("나눠지는 숫자를 입력해주세요.> ");
			int inputNum = sc.nextInt();
			System.out.print("나눌 숫자를 입력해주세요.> ");
			int inputNum2 = sc.nextInt();
			System.out.println("나눈 결과 : "+divide(inputNum,inputNum2));			
		}catch(ArithmeticException e) 
		{
			System.out.println("나누는 숫자가 0이 되면 안됩니다.");
		}catch(InputMismatchException e) 
		{
			System.out.println("정수를 입력해주세요.");
		}finally 
		{
			System.out.println("예외처리를 하든 안 하든 반드시 실행되는 부분입니다.");
		}
		
	}
	
	static int divide(int a, int b) throws ArithmeticException, InputMismatchException
	{
		int result = a/ b;
		return result;
	}
}

//throws는 예외 처리를 해당 메소드를 호출하는 곳에서 하도록 던져 주는 기능이다.
//따라서 throws가 있다면, 반드시 try catch문으로 해당 예외 처리를 해주어야 한다.