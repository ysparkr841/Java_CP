package test1021;

public class TVSample {

	public static void main(String[] args) {
		Tv t = new Tv(); //t는 Tv클래스 객체의 인스턴스
		Tv t2 = new Tv();
		
		t.channel = 11;
		
		t.channelUp();
		System.out.println("현재 채널은 "+t.channel+"입니다.");
		
		t.channelDown();
		t.channelDown();
		System.out.println("현재 채널은 "+t.channel+"입니다.");
		
		
		//t2의 현재 채널을 5번으로 초기화시키고 채널을 +버튼을 6번 누르시고, 출력
		//-2번 누르고 출력
		t2.channel = 5;
		t2.channelUp();
		t2.channelUp();
		t2.channelUp();
		t2.channelUp();
		t2.channelUp();
		t2.channelUp();
		
		System.out.println("t2의 현재 채널은 "+t2.channel+"입니다.");
		
		t2.channelDown();
		t2.channelDown();
		
		System.out.println("t2의 현재 채널은 "+t2.channel+"입니다.");
		
	}

}

class Tv
{
	String color;
	boolean power;
	int channel;
	
	void power()
	{
		power = !power;//true면 false로 false면 true로
	}
	
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	
	int channelChoice(int ch) 
	{	
		if(ch>333 || ch<0) 
		{
			System.out.println("입력하신 채널은 존재하지 않습니다.");
		}else 
		{
			channel = ch;
			System.out.println(ch+"번 채널이 입력되었습니다.");
		}
		return channel;
	}
}