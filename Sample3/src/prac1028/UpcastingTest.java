package prac1028;

public class UpcastingTest {

	public static void main(String[] args) {
		Parent pa = new Parent();
		System.out.println("pa의 a, b, c는 "+pa.a+" "+pa.b+" "+pa.c);
		
		Child ch = new Child();
		System.out.println("ch의 a, b, c는 "+ch.a+" "+ch.b+" "+ch.c);
		System.out.println("ch의 x, y, z는 "+ch.x+" "+ch.y+" "+ch.z);
		
		Parent pc = new Child();
		System.out.println("pc의 a, b, c는 "+pc.a+" "+pc.b+" "+pc.c);
		// System.out.println("pc의 x, y, z는 "+pc.x+" "+pc.y+" "+pc.z);
		//위는 사용 불가, 왜냐면, pc안에는 abc만 있으니, 해당 부분만 볼 수 있음.
		//생성자도 Child의 것을 사용.
	}

}

class Parent
{
	int a = 10;
	int b = 20;
	int c = 30;
}

class Child extends Parent
{
	int x = 40;
	int y = 50;
	int z = 60;
	
	Child(){
		this(200, 300, 400);
	}
	
	Child(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
}