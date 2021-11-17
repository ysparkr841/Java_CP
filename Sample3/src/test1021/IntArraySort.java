package test1021;

import prac1021.SelectionMethodPub;

public class IntArraySort {

	public static void main(String[] args) {
		SelectionMethodPub smp = new SelectionMethodPub();
		int[] num = new int[100];
		int i,j;
		for(i=0;i<num.length;i++) 
		{
			num[i] = (int)(Math.random()*100)+1;
			//중복제거
			for(j=0;j<i;j++) 
			{
				if(num[i] == num[j]) 
				{
					i--;
					continue;
				}
			}
		}
		for(i=0;i<30;i++) 
		{
			System.out.printf("%3d ", num[i]);			
		}
		System.out.println();
		for(i=30;i<60;i++) 
		{
			System.out.printf("%3d ", num[i]);		
		}
		System.out.println();
		for(i=60;i<90;i++) 
		{
			System.out.printf("%3d ", num[i]);			
		}
		System.out.println();
		for(i=90;i<num.length;i++) 
		{
			System.out.printf("%3d ", num[i]);			
		}
		System.out.println();
		
		//정렬을 위해 객체를 통해 불러온 메소드 실행
		smp.selectionSortUse(num);
		for(i=0;i<30;i++) 
		{
			System.out.printf("%3d ", num[i]);			
		}
		System.out.println();
		for(i=30;i<60;i++) 
		{
			System.out.printf("%3d ", num[i]);			
		}
		System.out.println();
		for(i=60;i<90;i++) 
		{
			System.out.printf("%3d ", num[i]);			
		}
		System.out.println();
		for(i=90;i<num.length;i++) 
		{
			System.out.printf("%3d ", num[i]);			
		}
		
		//중복없이 출력됨
		//public으로 정의된 메소드여도 일단 사용하려면, import해줘야 함.
		//import prac1021.SelectionMethodPub; Scanner를 불러온 것처럼 이렇게 불러와서 사용해야 함.
	}

}
