package arraysQuestions;

public class ReverseWordsofSentence
{
	private static void mySolution(String sentence)
	{
		String [] words = sentence.split(" ");
		String [] newArr = new String[words.length];
		int i =words.length-1;
		
		for(String word : words)
		{
			newArr[i] =  word;
			i--;
		}
		System.out.println("The Reverse is:");
		for(String word : newArr)
		{
			System.out.print(word + " ");
		}
	}
	public static void main(String []args)
	{
		String sentence = "Apply Reverse function on this";
		mySolution(sentence);
	}
}
