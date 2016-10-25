/*You are given a character array like this a3b1c1d1e4f0g11. 
 * You will have to expand the array by repeating the characters denoted by the following numbers. 
 * For example the above character array will be expanded to aaabcdeeeeggggggggggg. 
 * The given array will have more than enough trailing spaces such that you can modify the array in place.*/

package arraysQuestions;

public class ExpandTheArray
{
	private static void expandArr(String arr)
	{
		String[] newArr = arr.split("(?<=[@[0-9]])");
		int index = 0;
		for (String s : newArr)
		{
			int num = Character.getNumericValue(s.charAt(1));
			for (int i = 0; i < num; i++)
			{
				System.out.print(s.charAt(0));
			}
			index++;
		}
	}

	public static void main(String[] args) {
		String arr = "a3b6c3";
		expandArr(arr);
	}

}
