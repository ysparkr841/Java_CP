package test1027;

public class Sample1027_6 {

	public static void main(String[] args) {
		Card2 cd = new Card2();
		System.out.println("cd.KIND : "+cd.KIND);
		System.out.println("cd.NUMBER : "+cd.NUMBER);
		//cd.NUMBER = 11; 컴파일 오류
		
		//모든 클래스는 extends Object인 상태임. 생략된 것.
		System.out.println("cd : "+cd); //그냥 cd를 쓰면 주소값이지만, 내부적으로는 .toString을 호출하게 되어있는 것임.
		//println이라는 아이가 참조형 변수의 경우 알아서 toString으로 호출해 줌. 컨트롤 누르고 보면 됨.
		System.out.println("cd : "+cd.toString());
		
		Card2 cd2 = new Card2("SPADE");
		System.out.println("cd2.KIND : "+cd2.KIND);
		System.out.println("cd2.NUMBER : "+cd2.NUMBER);
	}

}

class Card2 //사실 상속받지 않은 클래스는 extends Object가 생략된 것.
{
	
	final int NUMBER; //상수는 대문자 풀로.
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card2(String kind, int num)
	{
		//원래 final은 숫자를 못바꾸지만 생성자에서는 처음에 값이 없을 때 숫자 줄 수 있음.
		KIND = kind;
		NUMBER = num;
	}
	
	Card2()
	{
		this("HEART", 1);
	}
	
	Card2(String kind)
	{
		//this();
		KIND = kind;
		NUMBER = 0; //초기값을 주지 않으면, 안됨. final이라서. 
	}
	
	
	@Override //String 클래스의 toString()을 오버라이딩한 부분.
	public String toString() 
	{
		return KIND+"--"+NUMBER;
	}
	
	
}
