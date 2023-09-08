package week3.homework;

public class PrintDuplicatesArray {
	
	public void duplicate()
	{
		int a[] = {1,2,4,1,6,8,2,};
		int i;
		for ( i = 0; i < a.length-1; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]==a[j]) {
					
					System.out.println("Duplicate Value "+ a[j]);
					
				}
				
			}
			
		}
	}
	
	public static void main(String args[])
	{
		PrintDuplicatesArray pDA = new PrintDuplicatesArray();
		pDA.duplicate();
	}

}
