/**
 * 
 */
package prac1021;

/**
 * @author user
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num = new int[] {85,75,70,60,95,45,85,35,65,15};
		
		int i, j, index, tmp;
		for(i=0;i<num.length-1;i++) 
		{
			index = i;
			for(j=i+1;j<num.length;j++)
			{
				if(num[index] > num[j]) 
				{
					index = j;
				} 
			}
			
			if(i != index)
			{
				tmp = num[i];
				num[i] = num[index];
				num[index] = tmp;
			}
		}
		for(i=0;i<num.length;i++) 
		{
			System.out.printf("num[%d] = %d\n", i, num[i]);			
		}
	}

}
