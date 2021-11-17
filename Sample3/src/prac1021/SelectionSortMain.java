package prac1021;

import java.util.Arrays;

public class SelectionSortMain {

	public static void main(String[] args) {
		SelectionMethod ms = new SelectionMethod();
		
		int i, j;
		int[] ranArr = new int[30];
		for(i=0;i<ranArr.length;i++)
		{	
			ranArr[i] = (int)(Math.random()*100)+1; //1부터 100까지의 랜덤 수가 들어감.
			for(j=0;j<i;j++) 
			{
				//중복 제거
				if(ranArr[i] == ranArr[j]) 
				{
					i--;
					continue;
				}
			}
		}
		
		System.out.println(Arrays.toString(ranArr));
		
		ms.selectionMethod(ranArr, ranArr.length);
		System.out.println(Arrays.toString(ranArr));		
	}

}
