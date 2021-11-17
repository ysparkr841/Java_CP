package test1027;

public class Sample1027_2 {

	public static void main(String[] args) {
		
		Pro p1 = new Pro();
		Pro p2 = new Pro();
		Pro p3 = new Pro();
		
		System.out.println("p1.serialNo = "+p1.serialNo); //예상: 1
		System.out.println("p2.serialNo = "+p2.serialNo); // 2
		System.out.println("p3.serialNo = "+p3.serialNo); // 3
		
		System.out.println("총 개수는 "+Pro.count);
	}

}

class Pro
{
	//클래스 변수는 클래스 하나당 하나
	static int count = 0; //0을 넣어야 하나? 어차피 클래스가 생성될 때, 초기화되는 것이 아닌가?
	//인스턴스 변수는 객체마다 하나씩 
	int serialNo;
	
	//인스턴스 초기화 블럭
	{
		count++;
		serialNo = count;
	}
	
	Pro()
	{
		
	}
}