/**
 * 
 */
package prac1021;

import java.util.Arrays;

/**
 * @author user
 *
 */
public class UpgradeFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ss = new int[6];
		int i,j;
		for(i=0;i<ss.length;i++) 
		{
			ss[i] = (int)(Math.random()*45)+1;
			for(j=0;j<i;j++) 
			{
				if(ss[i] == ss[j]) 
				{
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(ss));
		for(int num: ss) 
		{
			System.out.println(num);
		}
	}

}
