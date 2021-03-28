
public class BST {
	
	private Node root;
	
	private static class Node{
		private int val;
		private Node left;
		private Node right;
		
		public Node(int val) {
			this.val= val;
			this.left= null;
			this.right= null;
			
		}
		
		
		
		
	}
	public BST() {
		this.root= null;
	}
	
	public static Node insertion(Node root, int val) {
		Node newNode= new Node(val);
		if(root == null) {
			return newNode;
		}
		if(val > root.val) {
			if(root.right != null) {
				insertion(root.right, val);
				
			}
			else {
				root.right= newNode;
			}
		}
		else {
			if(root.left!= null) {
				insertion(root.left, val);
			}
			else {
				root.left= newNode;
			}
		}
		return root;
		
	}
	
	public static Node searchBST(Node root, int val) {
		if(root == null) {
			return null;
		}
		if(root.val == val) {
			return root;
		}
		
		
		if(val > root.val) {
			return searchBST(root.right, val);
		}
		else {
			return searchBST(root.left, val);
		}
		
	
			
			
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BST tree= new BST();
		Node root= null;
		Node a= tree.insertion(root,5);
		Node b= tree.insertion(a,2 );
		Node c= tree.insertion(b,6 );
		Node d= tree.insertion(c, 1);
		Node e= tree.insertion(d, 7);
		Node f= tree.insertion(e, 4);
		Node g= tree.insertion(f, 3);
		
		searchBST(g, 4);

		

		
		

	}

}
