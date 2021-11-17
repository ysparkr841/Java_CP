package prac1027;

public class Prac1027_1 {

	public static void main(String[] args) {
		CC c1 = new CC();
		System.out.println("c1.x : "+c1.x);
		System.out.println("c1.y : "+c1.y);
		
		//위의 경우 생성자 자체가 없기 때문에 상속받은 값을 그대로 가진, 객체를 생성.
		
		CC1 cc1 = new CC1();
		System.out.println("cc1.x : "+cc1.x);
		System.out.println("cc1.y : "+cc1.y);
		//당연히 100, 100 나옴. 빈 초기화 블록이기 때문에, 안에 따로 내용이 없으니 인스턴스 변수의 값은 변하지 않음.
		//만약에 해당 부분에서 x와 y의 값이 전부 0으로 나오게 하고 싶다면
		//CC1의 빈 생성자 안에
		//{this.x = 0; this.y = 0;}을 넣어주든지, 아니면, 애초에 인스턴스 변수의 값을 주지 않으면 됨.
		
		CC1 cc2 = new CC1(250, 500);
		System.out.println("cc2.x : "+cc2.x);
		System.out.println("cc2.y : "+cc2.y);
		// 250 500
	}

}

class PP
{
	int x = 10;
}

class CC extends PP
{
	int y = 20;
}

class PP1
{
	int x = 100;
	
	PP1()
	{
		//super(); 얘가 생략
	}
	
	PP1(int x)
	{
		this.x = x;
	}
}

class CC1 extends PP1
{
	int y = 200;
	
	CC1(){}
	
	CC1(int x, int y)
	{
		super(x);
		this.y = y;
	}
}