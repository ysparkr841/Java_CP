package prac1101;

public class Ground {
	public String gN;
	public int topLv;
	public int botLv;
	
	Ground()
	{
		this("Starting Point", 0, 0);
	}
	
	Ground(String gN, int topLv, int botLv)
	{
		this.gN =gN;
		this.topLv = topLv;
		this.botLv = botLv;
	}
}
