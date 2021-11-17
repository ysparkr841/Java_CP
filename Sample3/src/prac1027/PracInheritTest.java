package prac1027;

public class PracInheritTest {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 21;
		stv.company = "LG";
		System.out.println("Brand : "+ stv.company);
		stv.showChannel();
		stv.channelUp();
		stv.channelUp();
		stv.channelUp();
		stv.channelDown();
		stv.showChannel();
		
		stv.powerGenie();
		stv.callGenie("야"); //잘못불러서 응답하지 않음.
	
		System.out.println("===========구분============");
		stv.callGenie("지니야");
	}

}

class Tv
{	
	static String company;
	int channel;
	String color;
	boolean power;
	
	void power() 
	{
		power = !power;
	}
	
	void showChannel() 
	{
		System.out.println("현재 채널: "+ channel);
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

class SmartTv extends Tv
{
	boolean genie = false;

	void powerGenie() 
	{
		genie = !genie;
	}
	
	void callGenie(String text) 
	{
		if(text == "지니야") 
		{
			if(genie) 
			{
				System.out.println("네. 무엇을 도와드릴까요?");			
			}			
		}
	}
	
}