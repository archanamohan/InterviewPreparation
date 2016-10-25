package arraysQuestions;

public class SpiralMatrix
{
	private static void mySolution(int [][]mat)
	{
		int k = mat.length;
		int n = mat[0].length;
		int m=0,l=0;
		System.out.println("n "+n);
		while(n>m && k>l)
		{
			if(n ==0 && k == 0)
				return;
			
			for(int i = m; i<n; i++ )
			{
				System.out.print(mat[m][i]+" ");
			}
			m++;
			for(int i = m; i< k; i++)
			{
				System.out.print(mat[i][k] + " ");
			}
			k--;
			for(int i = k; i>= l; i-- )
			{
				System.out.print(mat[k][i] + " ");	
			}
			n--;
			for(int i = k-1 ; i>m ; i--)
			{
				System.out.print(mat[i][l] + " ");
			}
			l++;			
		}
		
	}
	public static void main(String args[])
	{
		int [][] matrix = {{1,2,3,4,5},{14,15,16,17,6},{13,20,19,18,7},{12,11,10,9,8}};
		
		mySolution(matrix);
	}

}
