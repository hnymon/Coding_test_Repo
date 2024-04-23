import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		int n;
		for(int i=0; i<N; i++) {
			n = Integer.parseInt(br.readLine());
			if(n!=0) {
				s.push(n);
			}else {
				s.pop();
			}
		}
		int size = s.size();
		long sum = 0;
		for(int i=0; i<size; i++) {
			sum+= s.pop();
		}
		bw.write(sum+"");
		bw.flush();
		bw.close();
		br.close();
	}
}
