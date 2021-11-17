package pracInterface;

public class Eui implements Spawn{
	private String chaN;
	private String chaClass;
	private int lv;
	
	public Eui(String chaN, int lv) 
	{
		this.chaN = chaN;
		chaClass = "Assendent";
		this.lv = lv; 
	}

	@Override
	public String getChaN() {
		return chaN;
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
	public void print(PlaceInfo placeInfo) 
	{
		if(placeInfo != null) 
		{
			Ground ground = placeInfo.getGround();
			System.out.println("---"+chaN+" 정보 불러오기---");
			System.out.println("1. 지역 정보를 얻어옵니다.");
			if(ground != null) 
			{
				System.out.println("스폰지역 : "+placeInfo.getGround().getGRN());
				System.out.println("제한Lv : "+placeInfo.getGround().getTopLv());
				System.out.println("요구Lv : "+placeInfo.getGround().getBottomLv());
			}
			
			System.out.println("2. 스폰 위치 좌표를 출력합니다.");
			System.out.println("X : "+placeInfo.getX());
			System.out.println("Y : "+placeInfo.getY());
			
			System.out.println("3. "+ chaN + "이/가 해당 지역에 스폰됩니다.");
		}
	}
	
	public void setLv(int lv) 
	{
		this.lv = lv;
	}
}
