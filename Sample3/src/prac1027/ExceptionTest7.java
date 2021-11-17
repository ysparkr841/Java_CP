package prac1027;

public class ExceptionTest7 {

	public static void main(String[] args) 
	{
		ExceptionTest7 et7 = new ExceptionTest7();
		et7.exceptionMethod();
	}
	public void exceptionMethod() 
	{
		throw new NullPointerException();		
	}
	//오류 나는게 맞음
}
