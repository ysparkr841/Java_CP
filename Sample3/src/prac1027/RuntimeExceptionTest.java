package prac1027;

import java.util.Scanner;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("100에서 나눌 숫자를 입력하세요.> ");
		int num = sc.nextInt();
		if(num == 0) 
		{
			throw new RuntimeException("0을 입력하면 안됩니다.");
		}
		double dividedN = (double)100/num;
		System.out.println("dividedN = "+dividedN);
	}

}

//throw는 위처럼 오류를 일으키는 것. throws는 오류를 나를 호출한 곳에서 처리하도록 넘기는 것.
