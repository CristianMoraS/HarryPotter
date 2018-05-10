package azkaban;

public class Stack {
	Node head = null;
	public boolean isEmpty() {
		return head == null ? true : false;
	}
	public void pushStack(Node newNode) {
		Node temp = head;
		newNode.next = temp;
		head = newNode;
	}
	public int top() {
		Node temp = head;
		int val = temp.num;
		return val;	
	}
	public void popStack() {
		Node temp = head;
		head = head.next;
		temp = null;
		System.gc();
	}
	
}
