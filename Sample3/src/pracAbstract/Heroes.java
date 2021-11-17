package pracAbstract;

public class Heroes extends Game{
	private String characterName;
	private int lv;
	private String distribution;
	
	public Heroes(String name) 
	{
		this(name, "Epeng",  96, "Nexon");
	}
	
	public Heroes(String name, String characterName, int lv, String distribution) 
	{
		super(name);
		setCharacterName(name);
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
	
	public void printAll() 
	{
		System.out.println("게임2 {name : "+name+" | characterName : "+characterName+" | lv : "+lv+" | distribution : "+distribution+"}");	
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
}
