/**
 * 
 */
package prac1021;

/**
 * @author user
 *
 */
public class SelectionSotrMethodUse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num = new int[] {85,75,70,60,95,45,85,35,65,15};
		SelectionMethod ms = new SelectionMethod();
		ms.selectionMethod(num, num.length);
		int i;
		for(i=0;i<num.length;i++) 
		{
			System.out.printf("num[%d] = %d\n", i, num[i]);			
		}
	}

}


class SelectionMethod{
	void selectionMethod(int[] list, int length) 
	{
		int i, j , tmp, least;
		for(i=0;i<length-1;i++) 
		{
			least = i;
			for(j=i+1;j<length;j++) 
			{
				if(list[least]> list[j])
				{
					least = j;
				}
			}
			
			if(i != least) 
			{
				tmp = list[i];
				list[i] = list[least];
				list[least] = tmp;
			}
		}
	}
}