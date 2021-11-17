package prac1027;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchListTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList<>();
		
		System.out.println("입력할 인원 수를 입력하세요.> ");
		System.out.print("입력할 인원 수: ");
		try 
		{
			int num = sc.nextInt();
			int i;
			String inputN;
			int inputA;
			for(i = 0 ; i<num;i++) 
			{
				System.out.print((i+1)+".이름: ");
				inputN = sc.next();
				al.add(inputN);
			}
			for(i = 0; i<al.size();i++) 
			{
				System.out.println(al.get(i));
			}
			
			System.out.println("===========검색을 시작합니다.===========");
			boolean aa = true;
			do 
			{
				System.out.println("검색할 이름을 입력해주세요.> ");
				String searchN = sc.next();
			
				if(al.contains(searchN)) 
				{
					System.out.println("검색하신 "+al.get(al.indexOf(searchN))+"님은 배열의 "+(al.indexOf(searchN)+1)+"번째에 있습니다.");				
					aa = false;
				}else 
				{
					System.out.println("입력하신 이름은 존재하지 않습니다.");
				}									
			}
			while(aa);
			
		}
		catch(Exception e) 
		{
			System.out.println("올바른 값을 입력해주세요.");
		}
	}
}
	


