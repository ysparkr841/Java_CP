/**
 * 
 */
package test1020;

import java.util.Arrays;

/**
 * @author user
 *
 */
public class SelectionSortPrac {

	/**
	 * {156,489,798,256,348,888};
	 */
	public static void main(String[] args) {
		int[] num = new int[] {156,489,798,256,348,888};
		
		int i, j, tmp, tmpIndex;
		
		for(i=0;i<num.length-1;i++) 
		{
			tmpIndex = i;
			for(j=i+1;j<num.length;j++) 
			{
				if(num[tmpIndex]>num[j]) 
				{
					tmpIndex = j;
				}
			}
			
			//최소값이 자기 자신이면 자리이동하지 않음. i가 tmpIndex면 그냥 num[i] = num[i]랑 똑같음. 불필요한 동작을 하는 것.
			if(i != tmpIndex) 
			{
				tmp = num[i];
				num[i] = num[tmpIndex];
				num[tmpIndex] = tmp;
			}
		}
		
		for(i=0;i<num.length;i++) 
		{
			System.out.printf("num[%d] = %d ", i,num[i]);
		}
		
	}

}
