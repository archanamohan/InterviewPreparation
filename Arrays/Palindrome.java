package arraysQuestions;

public class Palindrome
{
	private static boolean checkPalindrome(String n)
	{
		int i = 0, j = n.length()-1;
		
		while(i<j)
		{
			if((n.charAt(i) != n.charAt(j)))
				return false;
			else
			{
				i++;
				j--;
				
			}
		}
		return true;
		
	}
	public static void main(String args[])
	{
		String n = "1237821";
		
		System.out.println("The Given String is a Palindrome? :  "+checkPalindrome(n));
	}

}
