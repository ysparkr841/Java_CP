package GameTestPrac1029;

public abstract class Game {
	String name;
	
	Game(String name)
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public abstract String getChaN();
	public abstract int getLv();
	public abstract String getDis();
	public abstract void print();
	
}
