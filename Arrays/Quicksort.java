package arraysQuestions;

public class Quicksort
{
	public static void printArray(int []a)
	{
		for(int i = 0; i < 10; i++)
			System.out.print(a[i] +"  ");
	}
	
	private static void quickSort(int left, int right, int []a)
	{
		if(a == null || a.length == 0)
			return;
		
		if(left >= right)
			return;
		
		int pivot = a[right];
		int part = partition(left, right, pivot);
		
		quickSort(left, part-1,a);
		quickSort(part+1, right,a);
	}
	
	private static int partition(int left, int right, int pivot)
	{
		int leftCursor = left - 1;
		int rightCursor = right;
		
		
		return pivot;
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		int a[] = {1,7,5,9,2,6,4,5,8,7};
		int a[] = new int[10];
		
		for(int i = 0; i< 10; i++)
			a[i] = (int) (Math.random()*100);
		
		System.out.println("The array to be sorted is");		
		printArray(a);
		
		quickSort(0, a.length-1, a);
	}

}
