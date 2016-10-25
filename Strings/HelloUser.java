package StringsQuestions;

import java.util.Scanner;

public class HelloUser
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String name = scn.nextLine();
		System.out.println("Hello "+ name);
		
	}
}
