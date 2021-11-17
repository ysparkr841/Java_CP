package GameTestPrac1029;

public class Poe extends Game {
	
	private String chaN;
	private int lv;
	private String dis; //배급사
	
	public Poe(String name)
	{
		this(name, "Ddupan", 95, "GGG");
	}
	
	public Poe(String name, String chaN ,int lv, String dis) 
	{
		super(name);
		setChaN(chaN);
		setLv(lv);
		setDis(dis);
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
		System.out.println("Game1 {name : "+name+" | chaN : "+chaN+" | lv : "+lv+" | dis : "+ dis+"}");
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
