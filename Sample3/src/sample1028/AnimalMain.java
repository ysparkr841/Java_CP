package sample1028;

public class AnimalMain {

	public AnimalMain(){}
	
	//찍어주는 메소드
	public void view(Animal animal) 
	{
		if(animal != null) 
		{
			if(animal instanceof Cat) //앞에는 참조변수 뒤에는 클래스, 문법/ 리턴 true false
									  //뭔 뜻이냐면, Animal타입의 참조변수 animal이 Bird클래스 객체로 받았는지 여부.
			{
				System.out.println("--- 동물 : 고양이 ---");
			}else if(animal instanceof Bird) 
			{
				System.out.println("--- 동물 : 새 ---");
			}else if(animal instanceof Dog) 
			{
				System.out.println("--- 동물 : 개 ---");
			}else 
			{
				System.out.println("정의하지 않았습니다.");
			}
			
			System.out.println("이름 : "+animal.getName());
			System.out.println("울음 : "+animal.getCry());
			System.out.println("움직임 : "+animal.getMove());
			System.out.println("먹이 : "+animal.getFood());
			
		}
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat("나비");
		Dog dog = new Dog("브라우니");
		Bird bird = new Bird("구구");
		
		cat.print();
		System.out.println(); //줄바꿈 문자
		
		dog.print();
		System.out.println();
		
		bird.print();
		System.out.println();
		
		cat.setCry("어흥");
		cat.print();
		System.out.println();
		
		bird.setMove("종종 걸음");
		bird.print();
		System.out.println();
		
		dog.setFood("말린 닭고기");
		dog.print();
		System.out.println();
		
		AnimalMain am = new AnimalMain();
		am.view(cat);
		System.out.println();
		
		am.view(dog);
		System.out.println();
		
		am.view(bird);
		System.out.println();
		
		
	}

}
