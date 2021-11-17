package sample1028;

public class Bird extends Animal 
{
	private String cry;
	private String move;
	private String food;
	
	public Bird(String name) 
	{
		this(name, "짹짹", "훨훨", "모이");
	}
	
	public Bird(String name, String cry, String move, String food) 
	{
		super(name);
		
		setCry(cry);
		setMove(move);
		setFood(food); //이렇게 하면 코드 중복 제거
		/*
		 *	this.cry = cry;
		 *	this.move = move;
		 *	this.food = food; 
		*/ 
	}
	
	public void setCry(String cry) 
	{
		this.cry = cry;
	}
	
	@Override
	public String getCry() 
	{
		return cry;
	}
	
	public void setMove(String move) 
	{
		this.move = move;
	}
	
	@Override
	public String getMove() 
	{
		return move;
	}
	
	public void setFood(String food) 
	{
		this.food = food;
	}
	
	@Override
	public String getFood() 
	{
		return food;
	}
	
	@Override
	public void print() 
	{
		System.out.println("Bird{name : "+name+", cry : "+cry+", move : "+move+", food : "+food+"}");
	}
}
