package test1027;

class Parent
{
	int x = 50;
}

class Child extends Parent
{
	int x = 40;
	
	void method() 
	{
		int x = 30;
		
		//각각 30 , 40 , 50 출력되게 바꾸기.
		System.out.println("x : "+x); 
		System.out.println("this.x : "+this.x);
		System.out.println("super.x : "+super.x);
	}
}

public class Sample1027_5 {

	public static void main(String[] args) 
	{
		Child c = new Child();
		c.method();
	}

}
