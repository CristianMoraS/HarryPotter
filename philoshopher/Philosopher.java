package philoshopher;
import java.io.*;
public class Philosopher {
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack monk = new Stack();//Stack
		Queue value = new Queue();//queue
		int sum = 0, f = 0;
		System.out.println("hola");
		int N = Integer.parseInt(br.readLine());
		String val[] = br.readLine().split(" ");//captura de valores
		for(int i = 1; i < N; i++) {
			value.enqueue(new Node(Integer.parseInt(val[i])));//ingreso de valores a una cola
		}
		//Entrada Q y x
		String qx[] = br.readLine().split(" ");
		int Q = Integer.parseInt(qx[0]);
		int X = Integer.parseInt(qx[1]);
		for(int j = 0; j < Q; j++) {
			String ins = br.readLine();
			if(ins == "Harry") {
				monk.pushStack(new Node(value.returnTail()));
				sum = sum + value.returnTail();
				value.dequeue();
				if(sum == X) {
					f = 1;
				}
			}else if(ins == "Remove") {
				sum = sum-monk.top();
				monk.popStack();
				if(sum == X) {
					f = 1;
				}
			}
		}
		if(f == 1) {
			monk.size();
		}else {
			System.out.println("-1");
		}
	}
}