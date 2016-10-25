package linkedListQuestions;

import linkedListQuestions.Node.*;
import linkedListQuestions.LinkedList1.*;

public class KthElementFromTheEnd
{
	public static void find_last_third()
	{
		
		Node curr = head, double_curr = head;
		int count =0;
		while(curr.next != null && count != 3)
		{
			curr =curr.next;
			count++;
		}
		while(curr.next != null)
		{
			curr = curr.next;
			double_curr = double_curr.next;
		}
		System.out.println("The Third element from last is "+ double_curr.data);
		
	}
	public static void main(String args [])
	{
		LinkedList1 l = new LinkedList1();
		l.addNode("9");
		l.addNode("8");
		
		l.addNode("7");
		l.addNode("6");
		l.addNode("5");
		l.addNode("4");
		l.addNode("3");
		l.addNode("12");
		l.display();
		find_last_third(l);
	}
	
}
