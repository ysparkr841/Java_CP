package prac1027;

import java.util.Scanner;

public class ExceptionTestSelf {

	public static void main(String[] args) 
	{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자를 입력해주세요.> ");
			int num = Integer.parseInt(sc.next());
			System.out.println("num = "+num);
		}catch(NumberFormatException e) 
		{
			System.out.println("숫자를 입력해주세요.");
		}
	}

}
