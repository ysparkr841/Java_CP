package pracAbstract;

public abstract class Game {

	String name; //게임 이름
	
	public Game(String name) 
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public abstract String getCharacterName();
	
	public abstract int getLv();
	
	public abstract String getDistribution();
	
	public abstract void printAll();
	
	
}
