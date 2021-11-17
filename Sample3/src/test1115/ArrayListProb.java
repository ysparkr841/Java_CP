package test1115;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProb {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		int i;
		
		//5명의 사람 이름을 입력 받아서 ArrayList에 저장한 후에 이들 중 '김'씨 성을 가진 사람을 모두 출력하시오.
		Scanner sc = new Scanner(System.in);
		for(i=0;i<5; i++) 
		{
			System.out.print("이름을 입력하세요.>");
			names.add(sc.next());
		}
		
		ArrayList<String> result = new ArrayList<>(); 
		
		String firstName;
		
		System.out.print("검색할 성을 입력하세요.>");
		String fName = sc.next();
		
		for(i=0;i<names.size();i++) 
		{
			firstName = names.get(i).substring(0,1);
			if(firstName.equals(fName)) 
			{
				result.add(names.get(i));
			}
		}
		
		System.out.println("검색 결과는 "+result+"입니다.");
		
	}

}
