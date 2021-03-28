
public class linkedList_leetcode {
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
	
	public linkedList_leetcode() {
		this.head= null;
		this.length= 0;
	}
	public int get(int ind) {
		int i=0;
		if(head == null) {
			return -1;
		}
		else {
			Node cur= head;
			while(cur != null) {
				if(ind== i) {
					return cur.val;
				}
				else {
					i++;
					cur= cur.next;
				}
			}
		}
		return -1;
	}
	public void addAtTail(int val) {
		Node newNode= new Node(val);
		if(head== null) {
			head= newNode;
			this.length++;
		}
		else {
			Node current= head;
			while(current.next!= null) {
				current= current.next;
			}
			current.next= newNode;
			this.length++;
		}
	}
	
	public void addAtIndex(int index, int val) {
		Node newNode = new Node(val);
        Node temp = head;
        int counter = 0;
        if((index) == this.length) {
            addAtTail(val);
            return;
        }
        if(index >= this.length) {
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        while(counter != (index -1)) {
            temp = temp.next;
            counter++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        this.length++;
			
		}
	
	public void deleteAtIndex(int index) {
		int i=0;
		if(head== null) {
			return;
		}
		else if( index >= this.length) {
			return;
		}
		else {
			Node current= head;
			
			while(current != null) {
				if(index == 0) {
					head= current.next;
					break;
				}
				else if(index == i+1) {
					current.next= current.next.next;
					break;
					
				}
				else {
					current= current.next;
					i++;
				}
			}
			this.length--;
		}
	}
		
		
		
	
	public void addAtHead(int val) {
		Node newNode= new Node(val);
		if(head==null) {
			head= newNode;
			this.length++;
		}
		else {
			if(head!= null) {
				newNode.next = head;
				head= newNode;
				this.length++;
			}
		}
		
		
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList_leetcode l1= new linkedList_leetcode();
		l1.addAtHead(2);
		l1.deleteAtIndex(1);
		l1.addAtHead(2);
		l1.addAtHead(7);
		l1.addAtHead(3);
		l1.addAtHead(2);
		l1.addAtHead(5);
		l1.addAtTail(5);
		l1.get(5);
		l1.deleteAtIndex(6);
		l1.deleteAtIndex(4);


		
		
		

	}

}
