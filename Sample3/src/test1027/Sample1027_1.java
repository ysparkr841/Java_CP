package test1027;

public class Sample1027_1 {
/*
	public static void main(String[] args) 
	{
		//생성자를 통한 인스턴스 복사
		Car2 c1 = new Car2();
		Car2 c2 = new Car2(c1);
		//생성자를 통해서 내용을 복사한 부분
		
		System.out.println("c1.color : "+ c1.color+", c1.gearType : "+c1.gearType+", c1.door: "+c1.door);		
		System.out.println("c2.color : "+ c2.color+", c2.gearType : "+c2.gearType+", c2.door: "+c2.door);
		
		c1.door = 2;
		System.out.println("==========c1.door 변경 후=============");
		System.out.println("c1.color : "+ c1.color+", c1.gearType : "+c1.gearType+", c1.door: "+c1.door);
		System.out.println("c2.color : "+ c2.color+", c2.gearType : "+c2.gearType+", c2.door: "+c2.door);
		//c1과 c2는 다른 집		
	}
*/
	//클래스 초기화 블럭
	static 
	{
		System.out.println("static{   }");
	}
	
	//인스턴스 초기화 블럭
	{
		System.out.println("{    }");
	}
	
	//생성자 호출
	Sample1027_1()
	{
		System.out.println("Sample1027_1 생성자");
	}
	
	public static void main(String[] args) 
	{
		//static 초기화 블럭은 클래스가 실행될 때 한번만
		//인스턴스 초기화 블럭은 객체가 생성될 때마다 {  } 출력
		//객체 생성할 때 초기화
		System.out.println("Sample1027_1 m1 = new Sample1027_1();");
		Sample1027_1 m1 = new Sample1027_1();
		
		System.out.println("Sample1027_1 m2 = new Sample1027_1();");
		Sample1027_1 m2 = new Sample1027_1();
	}
}

class Car2
{
	String color;
	String gearType;
	int door;
	
	Car2()
	{
		this("white","auto", 4);
	}
	
	Car2(Car2 c)
	{
		//밑에 칼라는 인스턴스 변수 color
		color = c.color;
		gearType = c.gearType;
		door = c.door;
		//생성자를 통해 내용을 복사하기 위한 생성자
	}
	
	Car2(String color, String gearType, int door)
	{
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}