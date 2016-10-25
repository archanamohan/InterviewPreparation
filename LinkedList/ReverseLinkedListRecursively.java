package linkedListQuestions;

import linkedListQuestions.ReverseLinkedListIteratively.Node;

public class ReverseLinkedListRecursively
{
	
	static class Node
	{
		public Node next;
		public int data;
		
		public Node(int _data)
		{
			data = _data;
		}
		
		public void printLinkedList()
		{
			Node head = this;
			while(head != null)
			{
				System.out.print(head.data + "->");
				head = head.next;
			}
			System.out.println();
		}
	}
	public static Node reverseLinkedList(Node head)
	{
		if(head.next == null)
			return head;
		Node newHead = reverseLinkedList(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	public static void main(String[] args)
	{
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		Node h = new Node(8);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = h;
		
		a.printLinkedList();
		Node head = reverseLinkedList(a);
		head.printLinkedList();
	}

}
