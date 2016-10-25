/* Print the following pattern
 *   	   #
  		  ##
 		 ###
		####
Observe that its base and height are both equal to n, and the 
image is drawn using # symbols and spaces. The last line is not preceded by any spaces.
Write a program that prints a staircase of size .
 * 
 * */

package StringsQuestions;

import java.util.Scanner;

public class Stairs {

	public static void main(String[] args)
	{
		System.out.println("Enter the number of lines:");
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <n ; i++) 
            builder.append(" ");
        int j = 0;

        for (int i = 1; i <=n; i++) {
            builder.replace(builder.length()-i,          
            builder.length() - j, "#");
            System.out.println(builder);
            j++;
        }
	}

}
