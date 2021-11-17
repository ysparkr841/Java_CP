package prac1028;

public class FinalTest {

	public static void main(String[] args) {
		Number nb = new Number();
		System.out.println("nb.NUM = "+nb.NUM+", nb.NAME = "+nb.NAME);
		
		Number nb1 = new Number(21, "No");
		System.out.println("nb1.NUM = "+nb1.NUM+", nb1.NAME = "+nb1.NAME);
	}

}

class Number
{
	final int NUM;
	final String NAME;
	
	Number()
	{
		this(20, "CHOI");
	}
	
	Number(int num, String name)
	{
		NUM = num;
		NAME = name;
	}
}