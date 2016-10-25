/*Given an array of integers, calculate 
 * which fraction of its elements are positive, which fraction of its
 *  elements are negative, and which fraction of its elements 
 * are zeroes, respectively. Print the decimal value of each fraction on a new line.
 * */

package arraysQuestions;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		System.out.println("Enter the length of the array followed by the array entries:");
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //float positive = 0.0, negative = 0.0, zero = 0.0;
        int pos_counter = 0, neg_counter = 0, zero_counter = 0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i] > 0)
                pos_counter++;
            else if(arr[arr_i] < 0)
                neg_counter++;
            else zero_counter++;
        }
        System.out.printf("%1.6f\n", (float)pos_counter/n);
        System.out.printf("%1.6f\n", (float)neg_counter/n);
        System.out.printf("%1.6f\n", (float)zero_counter/n);

	}

}
