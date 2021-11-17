package prac1028;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListPrac {

	public static void main(String[] args) {
		ArrayList<Integer> sumArr = new ArrayList<>();
		int i;
		for(i=0;i<10;i++) 
		{
			sumArr.add(i, i+1);
		}
		for(i=0;i<10;i++) 
		{
			System.out.println("sumArr.get("+i+") = "+sumArr.get(i));			
		}
		int ran = (int)Math.random()*10+1;
		int erasedN = sumArr.remove(ran);
		
		System.out.println("지워진 "+ran+"번째 인덱스의 값은 "+ erasedN+"입니다.");
		
		System.out.println("삭제 후 다시 출력");
		
		for(i=0;i<sumArr.size();i++) 
		{
			System.out.println("sumArr.get("+i+") = "+sumArr.get(i));			
		}
		
		boolean existN;
		
		Scanner sc = new Scanner(System.in);
		try 
		{
			System.out.print("검색할 숫자 입력.> ");
			int inputN = sc.nextInt();
			existN = sumArr.contains(inputN);
			if(existN) 
			{
				System.out.println("해당 숫자가 존재합니다.");
			}else 
			{
				System.out.println("해당 숫자가 존재하지 않습니다.");
			}			
		}catch(InputMismatchException ime) 
		{
			System.out.println("정수를 입력해주세요.");
		}
	}

}
