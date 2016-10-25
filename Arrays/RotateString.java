package arraysQuestions;

public class RotateString
{
	private static boolean mySolution(String s, String s2)
	{
		String str = s + s;
		return (str.contains(s2) && s.length() == s2.length());
	}
	public static void main(String args [])
	{
		String s = "rotation";
		String s2 = "tionrota";
		System.out.println("The rotation of the word is "+ mySolution(s,s2));
	}
}
