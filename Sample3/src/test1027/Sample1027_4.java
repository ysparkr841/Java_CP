package test1027;

public class Sample1027_4 {

	public static void main(String[] args) {
		/*
		Point3D p3d = new Point3D();
		p3d.x = 266;
		p3d.y = 2;
		p3d.z = 568;
		System.out.println("p3d.getLocation 결과 - "+p3d.getLocation());
		
		Point p = new Point();
		System.out.println("p.getLocation - "+p.getLocation());
		*/
		
		Point3D pd = new Point3D(); //빈 생성자에 100, 200, 300이 있기 때문에, 초기값은 100, 200, 300
		
		// Point pt = new Point(); 얘는 컴파일 오류, 매개변수가 없는 생성자가 없음.
		System.out.println("pd.x : "+pd.x+", pd.y : "+pd.y+", pd.z : "+ pd.z);
	}

}

class Point
{
	int x = 10;
	int y = 20;
	/*
	String getLocation() 
	{
		return "x : "+x+" | y : "+y;
	}
	*/
	
	Point(int x, int y)
	{
		//사실 super(); 얘가 생략되어 있음. 얘는 모든 클래스의 조상격인 Object 클래스임. 컴파일러가 자동으로 해줌. 상속받은 부모가 없을 때.
		this.x = x;
		this.y = y;
		System.out.println("Super부분");
	}
	
	
}

class Point3D extends Point
{
	int z = 30;
	
	Point3D()
	{
		this(100, 200, 300);
		System.out.println("This 부분 매개변수 없음");
	}
	
	// Point3D(){} 위의 내용을 지우고 이렇게 만들면, 오류, 왜? super();가 생략되었다고 보면 되는데, 
	//super()->빈 매개변수를 가진 생성자가 없음. 만약 오류가 안 나려면, Point클래스의 빈 생성자를 만들어 주든지, 매개변수 2개를 넣어서 
	// Point3D(){ super(3, 6); } 이런식으로 해주든지 해야 함.
	
	Point3D(int x, int y, int z)
	{
		super(x, y); //생성자 불러오는 것은 무조건 첫번째 줄에 있어야 함. this()랑 똑같음.
		System.out.println("This 부분 매개변수 3개");
		this.z = z;
		//순서를 모를 때는, System.out.println();을 디버깅 용으로 사용해서 알아보기. 어디부터 찍히는지.
	}
	
	/*
	@Override
	String getLocation() 
	{
		//return "x : "+x+" | y : "+y+" | z : "+z;
		return super.getLocation()+" | z : "+z; //이렇게도 가능
	}
	*/
	
	
}
