package week3.homework;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("sadiqbasha");
		char[] cs = str.toCharArray();
		int len = str.length();
		for (int i = 0; i < cs.length; i++) {
			if(i%2==0)
			{
				//System.out.println(cs[i]);
				String s = ""+cs[i];
				System.out.print(s.toUpperCase());
				
			}
			else
			{
				String a = ""+cs[i];
				System.out.print(a.toLowerCase());
			}
		}
		
	}

}
