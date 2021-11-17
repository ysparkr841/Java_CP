package test1112;

public class ArrayCopy {

	public static void main(String[] args) {
		//배열복사 
		int[] intArr = new int[] {1, 2, 3, 4, 5};
		int[] tmp = new int[intArr.length*2];
		int i;
		System.out.println("[변경전]");
		for(i = 0; i<intArr.length;i++) 
		{
			System.out.printf("intArr[%d]번째는 %d\n", i, intArr[i]);
		}
		
		for(i=0;i<intArr.length;i++) 
		{
			tmp[i] = intArr[i];
		}
		
		intArr = tmp;
		
		System.out.println("[변경후]");

		for(i = 0; i<intArr.length;i++) 
		{
			System.out.printf("intArr[%d]번째는 %d\n", i, intArr[i]);
		}
	}

}
