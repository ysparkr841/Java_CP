/**
 * 
 */
package test1020;

/**
 * @author user
 *
 */
public class Sample1020_8 {

	/**
	 * 로또 발생기 배열을 따로 만들어서 사용해보기
	 */
	public static void main(String[] args) {
		int[] num = new int[45];
		int[] ball = new int[6];
		int i;
/*		for(i=0;i<num.length;i++) {
			num[i]=i+1;
		}
		
		int rd, j;
		for(i=0;i<ball.length;i++) {
			for(j=0;j<=100;j++) {
				rd = (int)(Math.random()*45);
				ball[i] = num[rd];
			}
			//중복제거 어떻게 하지?
			
			for(j=0;j<i;j++) {
				if(ball[i] == ball[j]) {
					i--;
				}
			}
			
						
		}
		for(i=0;i<ball.length;i++) {
		System.out.printf("ball[%d] = %d\n",i,ball[i]);
		}
*/
		
		for(i=0;i<num.length;i++) {
			num[0] = i+1;
		}
		int rd;
		int j;
		
		for(i=0;i<ball.length;i++) 
		{
			for(j=0;j<=100;j++) {
				rd = (int)(Math.random()*45);
				ball[i] = num[rd];
				
				
				
			}
		}
	}

}
	
