import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static LinkedList<Integer> ll = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			String line = br.readLine();
			int a = Integer.parseInt(line.split(" ")[0]);
			int x = 0;
			if(line.contains(" ")) {
				x = Integer.parseInt(line.split(" ")[1]);
			}
			if(a==1|| a==2) sol1(a,x);
			else {
				bw.write(sol2(a,ll)+"\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
	public static void sol1(int a, int x) {
		if(a==1) ll.addFirst(x);
		else ll.addLast(x);
	}
	public static int sol2(int a, LinkedList<Integer> ll) {
		int res = -1;
		if(a==3 && !ll.isEmpty()) {
			res = ll.removeFirst();
		}
		else if(a==4 && !ll.isEmpty()) {
			res = ll.removeLast();
		}
		else if(a==5) {
			res = ll.size();
		}
		else if(a==6) {
			if(ll.isEmpty()) res = 1;
			else res = 0;
		}
		else if(a==7 && !ll.isEmpty()) {
			res = ll.get(0);
		}
		else if(a==8  && !ll.isEmpty()) {
			res = ll.get(ll.size()-1);
		}
		return res;
	}
}
