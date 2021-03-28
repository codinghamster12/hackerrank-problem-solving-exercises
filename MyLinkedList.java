
public class MyLinkedList {
	
	private Node head;
	private int length;
	
	private class Node{
		private int val;
		private Node next;
		
		public Node(int data) {
			this.val= data;
			this.next= null;
		}
	}
	
	public MyLinkedList() {
		this.length=0;
		this.head= null;
	}
	
	public void addAtHead(int val) {
		Node newNode= new Node(val);
		if(head == null) {
			head= newNode;
			this.length++;
			
		}
		else {
			newNode.next= head;
			head= newNode;
			this.length++;
		}
	}
	
	public void addAtTail(int val) {
		Node newNode= new Node(val);
		Node curr= head;
		if(head == null) {
			head= newNode;
			this.length++;
		}
		else {
			while(curr.next != null) {
				curr= curr.next;
			}
			curr.next= newNode;
			this.length++;
			
		}
	}
	
	public int findElement(int index) {
		int count=0;
		Node curr = head;
		if(index >= length) {
			return -1;
		}
		else {
			
			while(index != count) {
				curr= curr.next;
				count++;
			}
			return curr.val;
		}
		
	}
	
	public int findElementNthToLast(int index) {
		int count= length-1;
		Node curr = head;
		if(index >= length) {
			return -1;
		}
		else {
			while(count != index) {
				curr= curr.next;
				count--;
			}
			return curr.val;
		}
		
	}
	
	public Node getNthFromEnd(Node head, int index) {
		int count= length;
		Node curr = head;
		if(index > length || index < 1) {
			return head;
		}
		else if(index == length) {
			curr= curr.next;
			this.length--;
			
		}
		
		
		else {
			
			
			while(count != index + 1) {
				curr= curr.next;
				count--;
				
			}
			
			if(index == 1) {
				curr.next = null;
				this.length--;
				
			}
			
			
			curr.next= curr.next.next;
			this.length--;
			
			
			
		}
		return curr;
	}
	
	public Node removeNthFromEnd(Node head, int n) {
		Node dummy= new Node(0);
		dummy.next= head;
		int length=0;
		Node first= head;
		while(first!= null) {
			length++;
			first= first.next;
		}
		length -= n;
		first = dummy;
	    while (length > 0) {
	        length--;
	        first = first.next;
	    }
	    first.next = first.next.next;
	    return dummy.next;
	}
		
		


	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList l1= new MyLinkedList();
		l1.addAtTail(5);
		l1.addAtTail(6);
		l1.addAtTail(7);
		l1.addAtHead(4);
		l1.addAtTail(8);
		l1.removeNthFromEnd(l1.head,5);
		

	}
}


