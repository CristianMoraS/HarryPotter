package philoshopher;

import java.io.*;

public class Queue {
	Node head = null;
	public boolean isEmpty() {
		return head == null ? true : false; 
	}
	public void enqueue(Node newNode) {
			newNode.next = head;
			head = newNode;
	}
	public void dequeue() {
		Node temp;
		Node pre = head;
		while(pre.next.next != null){
			pre = pre.next;
		}
		temp = pre.next;
		temp = null;
		pre.next = null;
		System.gc();
	}
	public int returnTail() {
		Node pre = head;
		Node temp;
		int valor;
		while (pre.next != null) {
			pre = pre.next;
		}
		temp = pre;
		return temp.recibir;
		
	}
//	public void printQueue() throws IOException{
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		Node temp = head;
//		while(temp != null)
//		{
//			bw.write(temp.toString());
//			temp = temp.next;
//		}
//		bw.flush();
//	}
//	public static void main(String []args) throws IOException {
//		Queue qu = new Queue();
//		qu.enqueue(new Node(8));
//		qu.enqueue(new Node(9));
//		qu.enqueue(new Node(10));
//		qu.enqueue(new Node(11));
//		qu.returnTail();
//		qu.dequeue();
//		
//		qu.printQueue();
//	}
}
