package week3.homework;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("madak");
		String str2 = new String("");
		char[] cs = str1.toCharArray();
		
		for(int i= cs.length-1; i>=0;i--)
		{
			str2 = str2+""+cs[i];
			//System.out.println(cs[i]);
			//System.out.println(str2);
		}
		System.out.println(str2);
		if(str1.equals(str2))
		{
			System.out.println("palindrome");
			
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
