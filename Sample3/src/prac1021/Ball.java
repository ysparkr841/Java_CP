/**
 * 
 */
package prac1021;

/**
 * @author user
 *
 */
public class Ball {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ball = new int[6];
		int[] num = new int[45];
		int j=0, i, tmp;
		for(i=0;i<num.length;i++) 
		{
			num[i]=i+1;
		}
		boolean result = true;
		while(result) 
		{
			for(i=0;i<ball.length;i++) 
			{
				ball[i] = num[(int)(Math.random()*45)];
				for(int a=0;a<i;a++) {
					if(ball[i]==ball[a]) 
					{
						i--;
						continue;
					}
				}
			}
			j++;
			if(j==100) 
			{
				result = false;
			}
		}
		for(i=0;i<ball.length;i++) 
		{
			System.out.printf("ball[%d] = %d\n", i, ball[i]);			
		}
		
	}

}
