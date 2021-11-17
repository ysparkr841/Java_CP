package test1115;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProb_2 {

	public static void main(String[] args) {
		ArrayList<String> nickname = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int i, j;
		for(i = 0 ; i<5; i++)
		{
			System.out.print("별명을 입력해주세요. 단, 입력한 별명의 길이는 다 달라야 합니다!>");
			nickname.add(sc.next());
		}
		
		System.out.println(nickname);
		
		String longName = "";
		int tmp = 0;
		
		for(i = 0; i<nickname.size()-1;i++) 
		{
			for(j= i+1;j<nickname.size();j++) 
			{
				if(nickname.get(i).length() < nickname.get(j).length()) 
				{
					tmp = j;
				}
			}
		}
		if(tmp != 0)
		longName = nickname.get(tmp);
	}

}
