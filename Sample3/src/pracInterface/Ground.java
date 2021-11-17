package pracInterface;

public class Ground {
	private String GRN;
	private int topLv; //lv제한 0이면 제한 없음
	private int bottomLv; //lv요구사항 0이면 제한 없음
	
	public Ground()
	{
		this("Start Point", 0, 0);
	}
	
	public Ground(String GRN, int topLv, int bottomLv) 
	{
		this.GRN = GRN;
		this.topLv = topLv;
		this.bottomLv = bottomLv;
	}
	
	public void setGRN(String GRN) 
	{
		this.GRN = GRN;
	}
	
	public String getGRN() 
	{
		return GRN;
	}
	
	public void setTopLV(int topLv) 
	{
		this.topLv = topLv;
	}
	
	public int getTopLv() 
	{
		return topLv;
	}
	
	public void setBottomLv(int bottomLv) 
	{
		this.bottomLv = bottomLv;
	}
	
	public int getBottomLv() 
	{
		return bottomLv;
	}
}
