import java.io.*;

public class LinkedList {
	
	private Node head;
	
	private static class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data= data;
			this.next= null;
		}
		
	}
	
	public void display(Node head) {
		Node current= head;
		if(current == null) {
			return;
			
		}
		while(current != null) {
			System.out.print(current.data + "--->");
			current= current.next;
		}
		System.out.print(current);
		
		
	}
	
	public Node insertNodeAtEnd(Node head, int data) {
		Node newNode= new Node(data);
		
		if(head == null) {
			
			return newNode;
		}
		
		Node current= head;
		
		
	
		while(current.next != null) {
			current= current.next;
		}
		current.next= newNode;
		
		return head;
		
	}
	
	public Node insertNodeAtStart(Node head, int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			return newNode;
		}
		
		newNode.next= head;
		return newNode;
	}
	
	public Node insertNodeAtPosition(Node head, int data, int position) {
		Node newNode= new Node(data);
		int count=0;
		
		if(head == null) {
			return newNode;
		}
		else {
			Node current= head;
			while(count < position - 1) {
				current= current.next;
				count++;
			}
			newNode.next= current.next;
			current.next= newNode;
			return head;
			
		}
	}
	
	public Node deleteNode(Node head, int position) {
		
		
		int count=0;
		if(position == 0 ) {
			return head.next;
		}
		else {
			Node current= head;
			while(count < position - 1) {
				current= current.next;
				count++;
			}
			current.next= current.next.next;
			return head;
		}
		
		
	}
	
	public static void reversePrint(Node head) {
		if(head.next != null) {
			reversePrint(head.next);
		}
		System.out.println(head.data);
	}
	
	public static Node reverse(Node head) {
		if (head == null || head.next == null) {
	        return head;
	    }

	    Node newHead = reverse(head.next); // reverse all but first
	    head.next.next = head; // make original second point at first
	    head.next = null; // make original first point at nothing

	    return newHead;
	}
	
	public static void main(String[] args) {
		
		Node head= null;
		LinkedList l= new LinkedList();
		
		
		Node x= l.insertNodeAtStart(head, 10);
		Node y= l.insertNodeAtStart(x, 20);
		Node z = l.insertNodeAtStart(y, 30);
		
		l.reverse(z);
		
		
		

		
		
		
	}

}


