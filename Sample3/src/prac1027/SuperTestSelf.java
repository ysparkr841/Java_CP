package prac1027;

class Parent
{
	String name;
	int age;
	
	Parent(){}
	
	Parent(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}

class Child extends Parent
{
	int height;
	int weight;
	
	Child(){}
	
	Child(String name, int age, int height, int weight)
	{
		super(name, age); //부모클래스의 생성자를 받아온 부분
		
		//여기부터는 자식 클래스의 생성자에서 추가적으로 주는 초기화 영역.
		this.height = height; 
		this.weight = weight;
	}	
}

public class SuperTestSelf {

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.age = 30;
		c1.name = "이가나";
		c1.height = 175;
		c1.weight = 88;
		
		System.out.println("c1의 모든 변수들 - c1.age: "+c1.age+", c1.name : "+c1.name+", c1.height : "+c1.height+", c1.weight : "+c1.weight);
		
		Child c2 = new Child("박다라", 45, 182, 99);
		System.out.println("c2의 모든 변수들 - c2.age: "+c2.age+", c2.name : "+c2.name+", c2.height : "+c2.height+", c2.weight : "+c2.weight);
		
	}

}
