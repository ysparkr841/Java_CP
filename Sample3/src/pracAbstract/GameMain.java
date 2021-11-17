package pracAbstract;

public class GameMain {

	
	void view(Game game) 
	{
		if(game != null) 
		{
			if(game instanceof PathOfExile) 
			{
				System.out.println("=========Path Of Exile============");
			}else if(game instanceof Heroes) 
			{
				System.out.println("============Heroes================");
			}else if(game instanceof Outward)
			{
				System.out.println("============Outward===============");
			}else 
			{
				System.out.println("정의하지 않았습니다.");
			}
			
			System.out.println("이름 : "+game.name);
			System.out.println("캐릭터명 : "+game.getCharacterName());
			System.out.println("레벨 : "+game.getLv());
			System.out.println("배급사 : "+game.getDistribution());			
		}
	}
	
	public static void main(String[] args) {
		PathOfExile poe = new PathOfExile("Path Of Exile");
		poe.printAll();
		
		Heroes hr = new Heroes("Heroes");
		hr.printAll();
		
		Outward outward = new Outward("Outward");
		outward.printAll();
		
		poe.setCharacterName("Ritual_Ddupan");
		poe.printAll();
		
		hr.setLv(88);
		hr.printAll();
		
		outward.setDistribution("Nine Dots Studio");
		outward.printAll();
		
		System.out.println();
		GameMain gm = new GameMain();
		
		System.out.println();
		gm.view(poe);
		
		System.out.println();
		gm.view(hr);
		
		System.out.println();
		gm.view(outward);
		
	}

}
