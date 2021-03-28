import java.io.*;
import java.util.Stack;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {
	
	private static int answer=0;
	private TreeNode root;
	
	public BinaryTree() {
		root= null;
	}
	
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int val) {
			this.val= val;
			this.left= null;
			this.right= null;
		}
		
		
		
	}
	
	
	public static boolean isSymmetric(TreeNode root) {
		   Queue<TreeNode> q = new LinkedList<>();
		    q.add(root);
		    q.add(root);
		    while (!q.isEmpty()) {
		        TreeNode t1 = q.poll();
		        TreeNode t2 = q.poll();
		        if (t1 == null && t2 == null) continue;
		        if (t1 == null || t2 == null) return false;
		        if (t1.val != t2.val) return false;
		        q.add(t1.left);
		        q.add(t2.right);
		        q.add(t1.right);
		        q.add(t2.left);
		    }
		    return true;
	}

	public static boolean isMirror(TreeNode t1, TreeNode t2) {
	    if (t1 == null && t2 == null) return true;
	    if (t1 == null || t2 == null) return false;
	    return (t1.val == t2.val)
	        && isMirror(t1.right, t2.left)
	        && isMirror(t1.left, t2.right);
	}
	
	public TreeNode insert(TreeNode root, int data) {
		if(root== null) {
			return new TreeNode(data);
		}
		else {
			TreeNode cur;
			if(data <= root.val) {
			cur= insert(root.left, data);
			root.left= cur;
			}
			else {
			cur= insert(root.right, data);
			root.right= cur;
			}
		}
		return root;
	}
	
	public static List<Integer> preorderTraversal(TreeNode root){
		List<Integer> list= new ArrayList<Integer>();
		if(root == null) {
			return list;
		}
		Stack<TreeNode> s= new Stack<TreeNode>();
		s.push(root);
		
		while(!s.isEmpty()) {
			root= s.pop();
			list.add(root.val);
			if(root.right!= null) {
				s.push(root.right);
			}
			if(root.left!= null) {
				s.push(root.left);
			}
		}
		
		return list;
		
		
	}
	
	public static void postOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		Stack<TreeNode> s1= new Stack<TreeNode>();
		Stack<TreeNode> s2= new Stack<TreeNode>();
		s1.push(root);
		
		
		while(!s1.isEmpty()) {
			root= s1.pop();
			s2.push(root);
			if(root.left!= null) {
				s1.push(root.left);
			}
			if(root.right != null) {
				s1.push(root.right);
			}
			
		}
		while(!s2.isEmpty()) {
			root= s2.pop();
			System.out.print(root.val + " ");
		}
		
		
	}
	
	
	
	public static void inorderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		Stack<TreeNode> s= new Stack<TreeNode>();
		while(true) {
			if(root!= null) {
				s.push(root);
				root= root.left;
			}
			else {
				if(s.isEmpty()) {
					break;
				}
				root= s.pop();
				System.out.print(root.val + " ");
				root= root.right;
			}
			
		}
		
			
		
	}
	public static void preOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		if(root!= null) {
			System.out.print(root.val + " ");
		}
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
		
	}
	
	public static void recursiveInOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		if(root.left != null) {
			recursiveInOrderTraversal(root.left);
		}
		System.out.print(root.val + " ");
		if(root.right != null) {
			recursiveInOrderTraversal(root.right);
			
		}
	}
	public static void levelOrder(TreeNode root) {
		   if(root == null) 
	            return; 
	          
	        // Create an empty queue for level order tarversal 
	        Queue<TreeNode> q =new LinkedList<TreeNode>(); 
	          
	        // Enqueue Root and initialize height 
	        q.add(root); 
	          
	          
	        while(true) 
	        { 
	              
	            // nodeCount (queue size) indicates number of nodes 
	            // at current level. 
	            int nodeCount = q.size(); 
	            if(nodeCount == 0) 
	                break; 
	              
	            // Dequeue all nodes of current level and Enqueue all 
	            // nodes of next level 
	            while(nodeCount > 0) 
	            { 
	                TreeNode node = q.peek(); 
	                System.out.print(node.val + " "); 
	                q.remove(); 
	                if(node.left != null) 
	                    q.add(node.left); 
	                if(node.right != null) 
	                    q.add(node.right); 
	                nodeCount--; 
	            } 
	            System.out.println(); 
	        } 

		
	}
	
	public static TreeNode bst(TreeNode root, int data) {
		TreeNode newNode= new TreeNode(data);
		if(root== null) {
			return newNode;
		}
		TreeNode cur= root;
		if(data > cur.val) {
			if(cur.right!= null) {
				bst(cur.right, data);
			}
			else {
				cur.right= newNode;
			}
			
			
		}
		else {
			if(cur.left!= null) {
				bst(cur.left, data);
			}
			else {
				cur.left= newNode;

				
			}
		}
		return cur;
	}
	

	
	public static int maxDepth(TreeNode root) {
		if(root == null) {
			return -1;
		}
		int leftHeight= maxDepth(root.left);
		int rightHeight= maxDepth(root.right);
		
		return 1 + Math.max(leftHeight, rightHeight);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root= new TreeNode(1);
		BinaryTree t= new BinaryTree();
		t.root= root;
		t.root.left= new TreeNode(2);
		t.root.right= new TreeNode(2);
		t.root.left.left= new TreeNode(3);
		t.root.left.right= new TreeNode(4);
		t.root.right.left= new TreeNode(4);
		t.root.right.right= new TreeNode(3);
		
		isSymmetric(root);
		
		
		
		
	}

}
