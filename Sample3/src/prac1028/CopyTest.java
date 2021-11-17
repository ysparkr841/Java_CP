package prac1028;

public class CopyTest {

	public static void main(String[] args) {
		//생성자를 통한 값 복사
		Num nm = new Num();
		nm.a = 11;
		nm.b = 22;
		System.out.println("nm.a = "+nm.a+", nm.b = "+nm.b);
		
		Num nm2 = new Num(nm);
		System.out.println("nm2.a = "+nm2.a+", nm2.b = "+nm2.b);
		nm.a = 33;
		nm.b = 44;
		System.out.println("nm.a = "+nm.a+", nm.b = "+nm.b);
		System.out.println("nm2.a = "+nm2.a+", nm2.b = "+nm2.b);
	}

}

class Num
{
	int a;
	int b;
	
	Num()
	{
		
	}
	
	Num(Num c)
	{
		a = c.a;
		b = c.b;
	}
}