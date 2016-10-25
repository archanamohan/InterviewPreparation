package linkedListQuestions;

public class LinkedList1
{
	Node head; 
	LinkedList1()
	{
		head = null;
	}
	public void addNode(String s)
	{
		Node n = new Node(s);
		if(head == null)
		{
			head=n;
		}
		else
		{
			n.next = head;
			head = n;
		}
	}
	public void add_endNode(String s)
	{
		Node n = new Node(s);
		if(head == null)
		{
			head=n;
		}
		else
		{
			Node curr = head;
			while(curr.next != null)
			{
				curr = curr.next;
			}
			curr.next = n;
			n.next = null;
		}
	}
	public void add_atPosition(String s, int pos)
	{
		Node n = new Node(s);
		if(head == null)
		{
			head=n;
		}
		else
		{
			Node curr = head;
			Node prev= head;
			int count = 0;
			while(curr.next != null && count!= pos-1)
			{
				prev = curr;
				curr = curr.next;
				count ++;
			}
			prev.next = n;
			n.next = curr;
		}
	}
	public void remove_firstNode()
	{
		if(head == null)
		{
			return;
		}
		else
		{
			head=head.next;
		}
	}
	public void remove_lastNode()
	{
		if(head == null)
		{
			return;
		}
		else
		{
			Node curr = head;
			Node prev= head;
			while(curr.next != null)
			{
				prev = curr;
				curr = curr.next;
			}
			prev.next = null;
		}
	}
	public void remove_atPosition(int pos)
	{
		if(head == null)
		{
			return;
		}
		else
		{
			Node curr = head;
			Node prev= head;
			int count = 0;
			while(curr.next != null && count!= pos-1)
			{
				prev = curr;
				curr = curr.next;
				count ++;
			}
			prev.next = curr.next;
		}
	}
	public void display()
	{
		Node curr = head;
		while(curr != null)
		{
			System.out.print(" "+curr.data+"->");
			curr = curr.next;
		}
		System.out.println();
	}

}
