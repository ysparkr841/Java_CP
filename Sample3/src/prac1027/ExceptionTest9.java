package prac1027;

public class ExceptionTest9 {

	public void exceptionMethod() throws Exception
	{
		throw new Exception();
	}
	
	public static void main(String[] args) 
	{
		ExceptionTest9 et9 = new ExceptionTest9();
		try 
		{
			et9.exceptionMethod();
		}
		catch(Exception e) 
		{
			System.out.println("호출한 메소드에서 예외처리 함");
		}
	}

}
