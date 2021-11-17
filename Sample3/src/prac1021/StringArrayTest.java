/**
 * 
 */
package prac1021;

/**
 * @author user
 *
 */
public class StringArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] name = new String[4];
		
		name[0] = new String("Park");
		name[1] = new String("No");
		name[2] = new String("Kim");
		name[3] = new String("Choi");
		
		int i;
		
		for(i=0;i<name.length;i++) 
		{
			System.out.println("name["+i+"] = "+name[i]);
		}
		for(i=0;i<name[0].length();i++)
		{
			char ch = name[0].charAt(i);
			System.out.println(ch);			
		}
		
		
	}

}
