package sample1028;

public abstract class Animal 
{
	protected String name; //동물 이름
	
	public Animal(String name) 
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
	
	//울음 추상메소드
	public abstract String getCry();
	
	//움직임 추상메소드
	public abstract String getMove();
	
	//먹는거 추상메소드
	public abstract String getFood();
	
	//출력 추상메소드
	public abstract void print();
}
