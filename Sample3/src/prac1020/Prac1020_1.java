/**
 * 
 */
package prac1020;

/**
 * @author user
 *
 */
public class Prac1020_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] score = new int[10];
		int i;
		for(i=0; i<score.length;i++) {
			score[i] = 90+i;
			System.out.printf("score[%d] = %d\n", i,score[i]);
		}
		int[] score2 = new int[10];
		int j;
		System.out.println();
		for(i=0,j=(score2.length-1);i<score2.length;i++,j--) {
			score2[i] = score[j];
			System.out.printf("score2[%d] = %d\n", i, score2[i]);
		}
	}

}
