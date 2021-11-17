package test1027;

public class Sample1027_3 {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 11;
		ctv.channelUp();
		System.out.println("현재 채널 : "+ ctv.channel);
		
		ctv.displayCaption("Hello World"); //초기값이 false이기 때문에 출력되지 않음.
		ctv.caption = true;
		ctv.displayCaption("Hello World");
		
		System.out.println("========================");
		//별도 ctv2라는 인스턴스 선언 후 , 채널 초기값은 11번
		//채널을 7번으로 메서드를 이용하여 변경하고.
		//자막상태가 on 상태에서 '자막을 시작합니다'문구를 출력
		
		CaptionTv ctv2 = new CaptionTv();
		ctv2.channel = 11;
		ctv2.channelDown();
		ctv2.channelDown();
		ctv2.channelDown();
		ctv2.channelDown();
		System.out.println("현재 채널: "+ctv2.channel);
		ctv2.caption = !ctv2.caption;
		ctv2.displayCaption("자막을 시작합니다.");
		
		System.out.println("========================");
		//생성자를 사용해서 초기값을 11로 줘보자
		CaptionTv ctv3 = new CaptionTv(11);
		System.out.println("현재 채널: "+ctv3.channel);
		ctv3.onOffCaption();
		ctv3.displayCaption("Hello world");
		ctv3.onOffCaption();
		ctv3.displayCaption("Hello world"); //자막 기능이 off이기 때문에 출력 x
		
	}

}

class Tv
{
	boolean power;
	int channel;
	
	void power() 
	{
		power = !power;
	}
	
	void channelUp() 
	{
		channel++;
	}
	
	void channelDown() 
	{
		channel--;
	}
	
	
}

class CaptionTv extends Tv
{
	//자식클래스는 최소 부모클래스와 같거나 큼.
	boolean caption; //자막 상태
	
	CaptionTv(int channel)
	{
		this.channel = channel;
	}
	
	CaptionTv()
	{
		//빈 생성자는 위의 매개변수가 있는 생성자 때문에 반드시 정의해줘야 함.
	}
	
	void onOffCaption() 
	{
		if(caption !=true) 
		{
			System.out.println("자막 기능 On");
			caption = !caption;			
		}else 
		{
			System.out.println("자막 기능 Off");
			caption = !caption;
		}
	}
	
	void displayCaption(String text) 
	{
		if(caption) 
		{
			System.out.println(text);
		}
	}
}