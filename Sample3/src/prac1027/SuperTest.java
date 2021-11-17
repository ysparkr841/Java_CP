package prac1027;

class Employee1
{
	String name; //부서
	String dept; //부서
	int salary; //연봉
	
	String getEmployeeInfo() 
	{
		return "이름 : "+name+", 부서 : "+dept+", 연봉 : "+salary;
	}
}

class SalesMan1 extends Employee1
{
	int commission; //수당
	
	String getEmployeeInfo() 
	{
		return super.getEmployeeInfo()+", 수당 : "+commission;
	}
}

public class SuperTest {

	public static void main(String[] args) {
		SalesMan1 sm1 = new SalesMan1();
		System.out.println(sm1.getEmployeeInfo());
	}

}
