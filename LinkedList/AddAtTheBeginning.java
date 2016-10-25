package linkedListQuestions;

import linkedListQuestions.Node.*;
import linkedListQuestions.LinkedList1.*;



public class AddAtTheBeginning
{
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
		
		System.out.println("Add at the end:");
		l.add_endNode("84");
		l.display();
		
		
		System.out.println("Adding at the pos");
		l.add_atPosition("75", 3);
		l.display();
		
		System.out.println("Remove first node");
		l.remove_firstNode();
		l.display();
		
		System.out.println("Remove Last node");
		l.remove_lastNode();
		l.display();
		
		System.out.println("Remove at pos");
		l.remove_atPosition(5);
		l.display();
	}
}
