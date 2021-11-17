package sample1028;

public class Dog extends Animal
{

	//울음
	private String cry;
	//움직임
	private String move;
	//먹이
	private String food;
	
	public Dog(String name) 
	{
		this(name, "멍멍", "뛴다", "사료");
	}
	
	//생성자
	public Dog(String name, String cry, String move, String food) 
	{
		super(name); //animal에 이렇게 되어있음. 부모 클래스의 생성자.
		this.cry = cry;
		this.move = move;
		this.food = food;
	}
	
		//울음 추상메소드
		@Override
		public String getCry()
		{
			return cry;
		}
		
		//움직임 추상메소드
		@Override
		public String getMove()
		{
			return move;
		}
		
		//먹는거 추상메소드
		@Override
		public String getFood()
		{
			return food;
		}
		
		//출력 추상메소드
		@Override
		public void print()
		{
			System.out.println("Dog{name : "+name+", cry : "+cry+", food : "+food+"}");
		}
	
	public void setCry(String cry) 
	{
		this.cry = cry;
	}
	
	public void setMove(String move) 
	{
		this.move = move;
	}
	
	public void setFood(String food) 
	{
		this.food = food;
	}
	
}
