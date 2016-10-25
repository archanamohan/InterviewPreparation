package arraysQuestions;

import java.util.Scanner;

public class AbsDiffOfDiagonals {

	public static void main(String[] args)
	{
		System.out.println("Enter the number of rows/colums followed by the input:");
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int princiDiagonal=0, secDiagonal = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if(a_i == a_j)
                    princiDiagonal += a[a_i][a_j];
                if(a_i == n-a_j-1)
                   secDiagonal += a[a_i][a_j];
            }
        }
        System.out.print("The Absolute Difference between the diagonals is "+Math.abs(princiDiagonal-secDiagonal));
	}

}
