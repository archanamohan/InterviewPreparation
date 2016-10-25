package arraysQuestions;

import java.util.Arrays;
import java.util.Random;

public class LeastDifference {

	private static int mySolution(int arr[]) // Complexity of this code is O(n^2)
	{
		int diff = Math.abs(arr[0]-arr[1]);
		for(int i = 0; i< arr.length-1; i++)
		{
			for(int j = i+1; j< arr.length; j++ )
			{
				if(diff> Math.abs(arr[i]-arr[j]))
					diff = Math.abs(arr[i]-arr[j]);
			}
		}
		return diff;
	}
	
	private static int betterSolution(int arr[])  // Complexity of this code is O(nlog n)
	{
		Arrays.sort(arr);
		int minDiff =0;
		for(int i =0 ; i<arr.length;i++)
		{
			if(minDiff> Math.abs(arr[i]-arr[i+1]))
				minDiff = Math.abs(arr[i]-arr[i+1]);
		}
		return minDiff;
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[] = {1,5,24,9,12,14};
		
		/*int max =1000;
		int arr[] = new int[max];
		Random r = new Random();
		for(int i =0; i< max; i++)
		{
			arr[i] = r.nextInt(max);
		}
		*/
		
		int diff = mySolution(arr); //Or use betterSolution(arr)
		
		
		System.out.println("FINAL Least diff: "+diff);
	}
}
