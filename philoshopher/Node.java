package philoshopher;

public class Node {
	public int recibir;
	
	public Node next;
	
	public Node(int r) {
		this.recibir = r;
	}
	
	public String toString() {
		return this.recibir + "\n";
	}	
}
