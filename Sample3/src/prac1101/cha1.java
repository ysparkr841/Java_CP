package prac1101;

public class cha1 implements Spawn {
	private String name;
	private String chaClass;
	private int lv;
	
	public cha1(String name, int lv) 
	{
		this(name, "Rainger", lv);
	}
	
	public cha1(String name, String chaClass, int lv) 
	{
		this.name = name;
		this.chaClass = chaClass;
		this.lv = lv;
	}
	
	@Override
	public String getN() {
		return name;
	}
	@Override
	public String getChaClass() {
		return chaClass;
	}
	@Override
	public int getLv() {
		return lv;
	}
	@Override
	public void print(PlaceInfo placeInfo) {
		if(placeInfo != null) 
		{
			Ground ground  = placeInfo.getGround();
			System.out.println("---"+name+"---");
			if(ground != null) 
			{
				System.out.println("지역 이름:"+ground.gN);
				System.out.println("지역 제한LV"+ground.topLv);
				System.out.println("지역 요구LV"+ground.botLv);
				
			}
			
			System.out.println("x : "+placeInfo.getX());
			System.out.println("y : "+placeInfo.getY());
		}
	}
}
