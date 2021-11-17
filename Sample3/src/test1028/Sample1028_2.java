package test1028;
//다형성

class Car
{
	String color;
	int door;
	
	void drive() 
	{
		System.out.println("drive BBBBBBBBBBB");
	}
	
	void stop() 
	{
		System.out.println("stop.....");
	}
	
}

class FireEngine extends Car
{
	void water() 
	{
		System.out.println("water~~~~~~~~~~~");
	}
}
public class Sample1028_2 {
	
	public static void main(String[] args) {
		/*
		Car car = null;
		FireEngine f = new FireEngine();
		FireEngine f2 = null;
		
		f.water();
		car = f; //부모에게 자식
		
		f2 = (FireEngine)car; //자식에게 부모는 불가. so, 강제 형변환-FireEngine으로 형 변환하지만, 
							  //사실 car에는 f가 들어있고 f에는 FireEngine()이라는 클래스객체가 담겨있음
		f2.water();
		*/
		
		Car car = new Car(); //오류가 안나게 하려면 Car car = new FireEngine();
		Car car2 = null;
		FireEngine fe = null;
	
		car.drive();
		
		fe = (FireEngine) car; //여기 오류남.
		//강제 형변환이 안된다는 소리. 왜? car는 Car클래스 객체, fe는 FireEngine 객체.
		fe.drive();
		
		car2 = fe;
		
		car2.drive();
	}
	
}