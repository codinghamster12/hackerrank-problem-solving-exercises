import java.io.*;
import java.util.*;

public class Stack {
	
	private int[] arr;
	private int MAX_SIZE;
	private int top;
	
	public Stack(int size) {
		this.arr= new int[size];
		this.MAX_SIZE= size;
		this.top=-1;
	}
	
	public boolean isEmpty() {
		return this.top == -1;
	}
	
	public boolean isFull() {
		return this.top == MAX_SIZE - 1;
	}
	
	public void push(int x) {
		if(isFull()) {
			System.out.println("Stack overflow");
			
		}
		else {
			this.top += 1;
			arr[top] = x;
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Cannot pop from an empty stack");
		}
		else {
			this.top -= 1;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			return -1;
			
		}
		else {
			return arr[top];
		}
		
	}
	
	public int maxElement() {
		if(!isEmpty()) {
			int max= Integer.MIN_VALUE;
			for(int i =0; i<MAX_SIZE; i++) {
				if(max < arr[i]) {
					max= arr[i];
				}
				
			}
			return max;
		}
		else {
			return -1;
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack(10);
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		for(int i=0; i<n; i++) {
			
			int command= scanner.nextInt();
			if(command == 1) {
				int num = scanner.nextInt();
				s.push(num);
				
			}
			else if(command == 2) {
				s.pop();
				
			}
			else {
				System.out.println(s.maxElement());
			}
		}
		
		scanner.close();
		
	}

}
