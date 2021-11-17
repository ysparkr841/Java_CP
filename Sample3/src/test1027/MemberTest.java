package test1027;
import java.util.ArrayList;
import java.util.Scanner;

class Member
{
	private String member;
	private int age;
	private int height;
	
	Member()
	{
		
	}
	
	Member(String member, int age, int height)
	{
		setMember(member);
		setAge(age);
		setHeight(height);
	}
	
	public void setMember(String member) 
	{
		this.member = member;
	}
	
	public String getMember() 
	{
		return member;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setHeight(int height) 
	{
		this.height = height;
	}
	
	public int getHeight() 
	{
		return height;
	}
	
	public String toString() 
	{
		return "이름은 "+member+"이고, 나이는 "+age+", 키는 "+height+"입니다.";
	}
	
}

public class MemberTest {

	public static void main(String[] args) {
		Member p1 = new Member("박가나", 23, 180);
		Member p2 = new Member();
		p2.setMember("정가나");
		p2.setAge(25);
		p2.setHeight(190);
		
		System.out.println(p1);
		System.out.println(p2);
		
		Member p3 = new Member("최가나", 21, 160);
		Member p4 = new Member("노가나", 24, 168);
		Member p5 = new Member("김가나", 25, 172);
		
		ArrayList<String> nameArrL = new ArrayList<>();
		nameArrL.add(p1.getMember());
		nameArrL.add(p2.getMember());
		nameArrL.add(p3.getMember());
		nameArrL.add(p4.getMember());
		nameArrL.add(p5.getMember());
		
		int j;
		for(j=0;j<nameArrL.size();j++) 
		{
			System.out.println("nameArrL.get("+j+") = "+nameArrL.get(j));
		}
			
		
		ArrayList<Integer> ageArrL = new ArrayList<>();
		ageArrL.add(p1.getAge());
		ageArrL.add(p2.getAge());
		ageArrL.add(p3.getAge());
		ageArrL.add(p4.getAge());
		ageArrL.add(p5.getAge());
		
		ArrayList<Integer> heightArrL = new ArrayList<>();
		heightArrL.add(p1.getHeight());
		heightArrL.add(p2.getHeight());
		heightArrL.add(p3.getHeight());
		heightArrL.add(p4.getHeight());
		heightArrL.add(p5.getHeight());
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int i, index = -1;
		System.out.print("찾을 이름 : ");
		String inputN = sc.next();
		for(i=0;i<nameArrL.size();i++) 
		{
			
			if(inputN.equals(nameArrL.get(i))) 
			{
				index = i;
				break;
			}
		}
		
		if(index == -1) 
		{
			System.out.println("검색하시는 이름이 존재하지 않습니다."); 
		}else 
		{
			System.out.println("검색하시는 분의 이름 : "+nameArrL.get(index)+", 나이 : "+ageArrL.get(index)+"세, 키 : "+heightArrL.get(index)+"cm 입니다.");	
		}
		
		
	}

}