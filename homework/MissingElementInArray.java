package week3.homework;

import java.sql.Array;
import java.util.Arrays;

public class MissingElementInArray {
	
	public void missing()
	{
		int a[] = {1,6,3,4,2,7};// 1 2 3 4 5 6 =21,16
		
		int len = a.length;
		Arrays.sort(a);
		System.out.println("lenghth is "+ a[len-1]);
		int sum1=0;
		
		for(int i=0;i<len;i++)

		{
			sum1=sum1+a[i];
		}
		
		System.out.println("sum1 is "+sum1);
			
		
		int sum2=0;
		for (int i=1;i<=len+1;i++)
		{
			sum2=sum2+i;
			System.out.println("i is "+ i);
		}
		System.out.println("Sum2  "+ sum2);
		
		System.out.println("missing element is "+ (sum2-sum1));
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingElementInArray missEle = new MissingElementInArray();
		missEle.missing();
	}

}
