package week3.homework;

public class PrintFirstArrayMatch {
	
	 int a[] = {3,2,11,4,6,7,10};
	 int b[] = {1,2,8,4,9,7,10};
	
	public void find()
	{
	
		int len = a.length;
		//int c[] = new int[len];
		int i=0;
		int j;
		
		for (i=0; i<=len-1; i++)
		{
			for(j=i;j<=len-1;j++)
			{
				if(a[i]==b[j])
				{
					
				System.out.println(a[i]);	
				}
		
	}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintFirstArrayMatch pFAM = new PrintFirstArrayMatch();
		pFAM.find();
		
	}

}
