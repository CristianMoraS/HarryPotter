package azkaban;
import java.io.*;
public class Monk {
	public static void main(String []args) throws IOException{
		Stack st = new Stack();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = br.read();
		int i;
		int arr[] = new int[n];
		int front[] = new int[10000];
		int back[] = new int[10000];
		for(i = 1; i <= n; i++) {
			String temp[] = br.readLine().split(" ");
			arr[i] = Integer.parseInt(temp[i]);
		}
		
		for(i = 1;i<= n;i++) {
			if(st.isEmpty() || arr[st.top()] >= arr[i]) {
				st.pushStack(new Node(i));
			}else {
				while(!st.isEmpty() && arr[st.top()] < arr[i]) {
					front[st.top()] = i;
					st.popStack();
				}
				st.pushStack(new Node(i));
			}
		}
		while(!st.isEmpty()) {
			front[st.top()] = -1;
			st.popStack();
		}
		for(i = n; i > 0; --i) {
			if(st.isEmpty() || arr[st.top()] >= arr[i]) {
				st.pushStack(new Node(i));
			}else {
		        while (!st.isEmpty() && arr[st.top()] < arr[i]) {
		            back[st.top()] = i;
		            st.popStack();
		        }
		        st.pushStack(new Node(i));
			}
		}
		while (!st.isEmpty()) {
		    back[st.top()] = -1;
		    st.popStack();
		}
		for (i = 1; i <= n; ++i) {
		    System.out.println(front[i] + back[i]);
		}
	}
}
