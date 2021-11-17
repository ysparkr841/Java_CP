package GameTestPrac1029;

public class LOL extends Game {
	private String chaN;
	private int lv;
	private String dis;
	
	public LOL(String name) 
	{
		this(name, "Ddupan", 30, "Riot");
	}
	
	public LOL(String name, String chaN, int lv, String dis)
	{
		super(name);
		this.chaN = chaN;
		this.lv = lv;
		this.dis = dis;
	}

	@Override
	public String getChaN() {
		return chaN;
	}

	@Override
	public int getLv() {
		return lv;
	}

	@Override
	public String getDis() {
		return dis;
	}

	@Override
	public void print() 
	{
		System.out.println("Game2 {name : "+name+" | chaN : "+chaN+" | lv : "+lv+" | dis : "+ dis+"}");
	}
	
	public void setChaN(String chaN) 
	{
		this.chaN = chaN;
	}
	
	public void setLv(int lv) 
	{
		this.lv = lv;
	}
	
	public void setDis(String dis) 
	{
		this.dis = dis;
	}
}
