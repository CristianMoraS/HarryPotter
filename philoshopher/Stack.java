package philoshopher;
import java.io.*;
public class Stack {
	Node head = null;
	/** -- EMPTY -- **/
	public boolean isEmpty() {
		return head == null ? true : false;
	}
	public void pushStack(Node newNode) {
		Node temp = head;
		newNode.next = temp;
		head = newNode;
	}
	public void popStack() {
		Node temp = head;
		head = temp.next;
		temp = null;
		System.gc();
	}
	public int top() {
		Node temp = head;
		return temp.recibir;
	}
	public void size() {
		Node temp = head;
		int count = 0;
		while(temp != null) {
			count += 1;
			temp = temp.next;
		}
		System.out.println("Tamaño: " + count);
	}
}
