package prac1021;

public class SelectionMethodPub {

	public void selectionSortUse(int[] list) 
	{
		int i, j, tmp, tmpIndex;
		for(i=0;i<list.length-1;i++) 
		{
			tmpIndex = i;
			for(j=i+1;j<list.length;j++) 
			{
				if(list[tmpIndex] > list[j]) 
				{
					tmpIndex = j;
				}
			}
			
			if(i != tmpIndex) 
			{
				tmp = list[i];
				list[i] = list[tmpIndex];
				list[tmpIndex] = tmp;
			}
		}
	}
}
