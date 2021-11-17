/**
 * 
 */
package test1021;

/**
 * @author user
 *
 */
public class Sample1021_3 {

	/**
	 * 
	 */
	public static void main(String[] args) {
		//char 배열과 String 클래스 변환
		String src = "ABCD";
		int i ;
		
		for(i=0;i<src.length();i++)
		{
			char ch = src.charAt(i);
			System.out.println("src.charAt("+i+") : "+ch);
		}
		
		
		//String을 char 배열로 변환
		//toCharArray
		char[] chA = src.toCharArray();
		System.out.println(chA);
		
		//String배열 사용해보자
		String[] name = {"Kim","Park","Lee"};
		
		for(i=0;i<name.length;i++) 
		{
			System.out.println("name["+i+"] : "+name[i]);
		}
		
		String tmp = name[2];
		//같은 집 바라보고 있음.
		System.out.println("tmp : "+tmp);
		name[0] = "Yu";
		
		for(i=0;i<name.length;i++)
		{
			System.out.println("name["+i+"] : "+name[i]);
		}
		
		System.out.println(name[0].length());
		System.out.println(name[1].length());
		
		
	}

}
