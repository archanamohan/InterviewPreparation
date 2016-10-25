package arraysQuestions;

public class MoveZeroToRight {

	private static int[] mySolution(int arr[]) /* Complexity is O(n)*/ 
	{
		int i =0, j = arr.length-1;
		int temp = -1;
		for(int k =0 ; k< arr.length ; k++)
		{
			if(arr[i] != 0)
			{
				i++;
			}
			else if(arr[j]==0)
			{
				j--;
			}
			else if(arr[i] == 0 && arr[j]!=0)
			{
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
				j--;
			}			
			if(i>j)
				break;
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		//int arr[] = {1,0,2,0,3,0,4,0,8,0,0,1,0,2,0,0,0,1,4,7,4,1};
		int arr[] = {1,0,2,0,3,0,0,0,0,7,2,1,0,2};
		int newArr[] = mySolution(arr);
		System.out.println("New Arrar: ");
		for(int i =0 ;i<newArr.length ; i++)
		{
			System.out.print(newArr[i]);
		}
		

	}
	
}
