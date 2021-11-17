package pracAbstract;

public class PathOfExile extends Game {
	private String characterName; //캐릭터명
	private int lv;	//레벨
	private String distribution; //배급사
	
	public PathOfExile(String name)
	{
		this(name, "Scourge_Ddupan", 96, "GGG"); //배급사는 한국에서는 다음이지만, 세계적으로 볼 때는, GGG
	}
	
	public PathOfExile(String name, String characterName, int lv, String distribution) 
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
	
	public String getCharacterName() 
	{
		return characterName;
	}
	
	public void setLv(int lv) 
	{
		this.lv = lv;
	}
	
	public int getLv() 
	{
		return lv;
	}
	
	public void setDistribution(String distribution) 
	{
		this.distribution = distribution;
	}
	
	public String getDistribution() 
	{
		return distribution;
	}
	
	public void printAll() 
	{
		System.out.println("게임1 {name : "+name+" | characterName : "+characterName+" | lv : "+lv+" | distribution : "+distribution+"}");	
	}
	
	
}
