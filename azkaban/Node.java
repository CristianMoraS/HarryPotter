package azkaban;

public class Node {
	public int num;
	public Node next;
	Node(int n){
		num = n;
	}
	public String toString() {
		return this.num + "  ";
	}
}
