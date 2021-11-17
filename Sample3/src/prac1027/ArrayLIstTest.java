package prac1027;

import java.util.ArrayList;

public class ArrayLIstTest {

	public static void main(String[] args) {
		ArrayList<String> als = new ArrayList<>(4);
		als.add(0, "Black");
		als.add(1, "White");
		als.add("Blue");
		als.add(3, "Yellow");
		als.add("Red");
		als.add("Blue");
		als.add("Pink");
		als.add("Blue");
		
		System.out.println("현재 배열의 사이즈는 "+als.size()+"입니다."); //5
		String color = als.remove(1); 
		// 배열 인덱스 1 지우기, 즉, white 지우기, 지우고 난 후,  인덱스 전부 1씩 앞당겨짐.
		// 배열을 통한 삭제의 경우, 해당 값을 리턴 받을 수 있음.
		System.out.println("배열의 1번 인덱스를 삭제 한 후=====");
		System.out.println("현재 배열의 사이즈는 "+als.size()+"입니다."); //4
		
		als.remove("Blue"); //Blue라는 내용 삭제, 처음 본 애 하나만.
		als.remove("Blue");
		als.remove("Blue");
		
		//배열 출력부
		int i;
		for(i=0;i<als.size();i++) 
		{
			System.out.println(als.get(i));
		}
		
		//위에서 삭제한 index1번의 White를 출력
		System.out.println("삭제된 인덱스 1번의 값은 \""+ color+"\"입니다.");
		
		//배열 검색
		String searchC = "Blue";
		boolean containC = als.contains(searchC);
		if(containC) 
		{
			System.out.println(searchC+"을/를 포함하고 있습니다.");
		}else 
		{
			System.out.println(searchC+"을/를 포함하고 있지 않습니다.");
		}
		
		int searchIndex = als.indexOf("Red");
		if(searchIndex == -1) 
		{
			System.out.println("검색하시는 값은 존재하지 않습니다.");
		}else 
		{
			System.out.println("검색하시는 값은 "+searchIndex+"번째 인덱스에 있습니다.");			
		}
		
		ArrayList als2 = new ArrayList<>();
		
		als2.add("가");
		als2.add(1);
		als2.add("나");
		als2.add(2);
		
		als2.clear(); //배열 삭제.
		
		for(i=0;i<als2.size();i++) 
		{
			System.out.println(als2.get(i));
		}
		
		ArrayList<Integer> al3 = new ArrayList<>();
		//ArrayList<int> al3 = new ArrayList<>(); ->타입부분에 int처럼 쓰면 안됨.
		
		al3.add(5);
		al3.add(1, 10);
		
		  for(i=0;i<al3.size();i++) 
		  {
			  System.out.println("al3.get("+i+") = "+al3.get(i)); 
		  }
		 
	}

}
