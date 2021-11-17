package pracAbstract;

public class Outward extends Game {
	private String characterName;
	private int lv;
	private String distribution;
	
	public Outward(String name) 
	{
		this(name, "Calixa", 0, "Steam");
	}
	
	public Outward(String name, String characterName, int lv, String distribution) 
	{
		super(name);
		setCharacterName(characterName);
		setLv(lv);
		setDistribution(distribution);
	}
	
	public void setCharacterName(String characterName) 
	{
		this.characterName = characterName;
	}
	
	public void setLv(int lv) 
	{
		this.lv = lv;
	}
	
	public void setDistribution(String distribution) 
	{
		this.distribution = distribution;
	}
	
	public String getCharacterName() 
	{
		return characterName;
	}
	
	public int getLv() 
	{
		return lv;
	}
	
	public String getDistribution() 
	{
		return distribution;
	}
	
	public void printAll() 
	{
		System.out.println("게임3 {name : "+name+" | characterName : "+characterName+" | lv : "+lv+" | distribution : "+distribution+"}");	
	}
}
