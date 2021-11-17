package pracInterface;

public interface Spawn 
{
	//캐릭터명 
	public String getChaN();
	
	//캐릭터 직업
	public String getChaClass();
	
	//캐릭터 레벨
	public int getLv();
	
	//출력
	public void print(PlaceInfo placeInfo);
	
}
