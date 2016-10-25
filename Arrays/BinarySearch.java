package arraysQuestions;

import java.util.Scanner;

public class BinarySearch
{
	public static int binarySearch(int a[], int num)
	{
		int low = 0, high = a.length-1;
		//int mid = (low + high)/2;
		while(high >= low)
		{
			int mid = (low + high)/2;
			if(a[mid] == num)
				return mid;
			else if(a[mid] < num)
				low = mid + 1;
			else if(a[mid] > num)
				high = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[] = {1,8,14,16,19,25,87};
		
		System.out.println("Enter the value that you want to search: ");
		Scanner s = new Scanner(System.in);
		int num = Integer.parseInt(s.nextLine());
		System.out.println("Number found in position: "+ binarySearch(arr, num));
		
	}

}
