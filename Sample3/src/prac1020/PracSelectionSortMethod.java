/**
 * 
 */
package prac1020;

/**
 * @author user
 *
 */
public class PracSelectionSortMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] score = new int[] {90,80,75,95,85,75,80};
		SelectionSortMethodM ssmm = new SelectionSortMethodM();
		ssmm.selectionSortMethod(score, score.length);
		
		int i;
		for(i=0;i<score.length;i++) 
		{
			System.out.printf("score[%d] = %d\n", i, score[i]);
		}
	}
}

class SelectionSortMethodM{
	void selectionSortMethod(int[] list, int index) {
		int i,j,tmp, var;
		for(i=0;i<index-1;i++) 
		{	
			tmp = i;
			for(j=i+1;j<index;j++) 
			{
				if(list[tmp]>list[j]) 
				{
					tmp = j;
				}
			}
			
			if(i != tmp) 
			{
				var = list[i];
				list[i] = list[tmp];
				list[tmp] = var;
			}
		}
	}
}
