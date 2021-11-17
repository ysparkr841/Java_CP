package sample1028;

public class Cat extends Animal
{
	private String cry;
	private String move;
	private String food;
	
	public Cat(String name) 
	{
		this(name, "야옹", "사뿐사뿐", "생선");
	}
	
	public Cat(String name, String cry, String move, String food) 
	{
		super(name);
		this.cry = cry;
		this.move = move;
		this.food = food;
	}
	
	@Override
	public String getCry() 
	{
		return cry;
	}
	
	@Override
	public String getMove() 
	{
		return move;
	}
	
	@Override
	public String getFood() 
	{
		return food;
	}
	
	@Override
	public void print() 
	{
		System.out.println("Cat{name: "+name+", cry : "+cry+", move : "+ move+", food : "+food+"}");
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
