package test1028;

class Time //데이터베이스의 테이블 하나당 클래스 하나고 이름도 같음
{
	private int hour, minute, second; //여기 변수들은 해당 테이블의 컬럼값임. 보통 private함 왜냐면 값을 건드리면 안되니깐.
	
	Time(int hour, int minute, int second)
	{
		setHour(hour);
		setMinute(minute);
		setSecond(second);
		//private을 안하면 this.hour = hour를 일일이 해야겠지만, 코드 중복임.
		//코드의 중복을 최소화 하기 위해
		//해당하는 set메소드에 매개변수를 넣어주면 됨.
	}
	
	Time(){}

	public void setHour(int hour) 
	{
		if(hour <0 || hour>23) 
		{
			return; //이 시점에 나를 호출한 곳으로 보냄.
		}
		this.hour = hour;
	}
	
	public int getHour() 
	{
		return hour;
	}
	
	public void setMinute(int minute) 
	{
		if(minute>59 || minute<0) 
		{
			return;
		}
		this.minute = minute;
	}

	public int getMinute() 
	{
		return minute;
	}
	
	public void setSecond(int second) 
	{
		if(second>59 || second<0) 
		{
			return;
		}
		this.second = second;
	}
	
	public int getSecond() 
	{
		return second;
	}
	
	public String toString() 
	{
		return hour +":"+minute+":"+second;
	}
	
}

public class Sample1028_1 {

	public static void main(String[] args) {
		Time tm = new Time(12, 35, 30);
		System.out.println(tm); //tm.toString()을 호출한 것. 오버라이딩 함: 기존의 주소-> 시:분:초 의 형태로
		
		tm.setHour(tm.getHour()+1);
		System.out.println(tm);
		//11:12:35
		tm.setHour(tm.getHour()-2);
		// OR tm.setHour(11);
		tm.setMinute(tm.getMinute()-23);
		// OR tm.setMinute(12);
		tm.setSecond(tm.getSecond()+5);
		// OR tm.setSecond(35);
		
		System.out.println(tm);
		
		System.out.println("=======구분=========");
		System.out.println("tm의 hour:minute:second = "+tm.getHour()+":"+tm.getMinute()+":"+tm.getSecond());

		Time tm2 = new Time();
				
		tm2.setHour(7);
		tm2.setMinute(52);
		tm2.setSecond(54);
		System.out.println("tm2.hour:tm2.minute:tm2.second = "+tm2.getHour()+":"+tm2.getMinute()+":"+tm2.getSecond());
	}

}
