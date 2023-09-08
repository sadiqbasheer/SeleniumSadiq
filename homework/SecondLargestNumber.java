package week3.homework;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,5,2,9,3,7,8};
		Arrays.sort(a);
		for (int num:a)
		{
			System.out.println(num);
		}
		
		System.out.println("the second largest number is :" + a[a.length-2]);
	}

}
