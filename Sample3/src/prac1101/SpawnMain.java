package prac1101;

public class SpawnMain {

	public void opertingSystemPrint(Spawn spawn, PlaceInfo placeInfo) 
	{
		if(spawn != null) 
		{
			System.out.println("name : "+spawn.getN());
			System.out.println("character class : "+spawn.getChaClass());
			System.out.println("Lv : "+spawn.getLv());
			
			if(placeInfo != null) 
			{
				System.out.println("");
			}
		}
	}
	
	public static void main(String[] args) {
		PlaceInfo placeInfo = new PlaceInfo(20, 30, new Ground("Cortex", 50, 25));
		
		cha1 cha1 = new cha1("Ddu", 49);
	}

}
