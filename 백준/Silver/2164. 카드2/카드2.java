import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<N; i++) {
			q.add(i+1);
		}
		while(true) {
			if(q.size()==1) break;
            q.poll();
			q.add(q.poll());
		}
		bw.write(q.peek()+"");
		bw.flush();
		bw.close();
		br.close();
	}
}
