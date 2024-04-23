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
		int last = 0;
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			switch(s.split(" ")[0]) {
			case "push" :
				int n = Integer.parseInt(s.split(" ")[1]);
				q.add(n);
				last = n;
				break;
			case "pop" :
				if(q.isEmpty()) {
					bw.write(-1+"\n");
				}else {
					bw.write(q.poll()+"\n");
				}
				break;
			case "size" :
				bw.write(q.size()+"\n");
				break;
			case "empty" :
				if(q.isEmpty()) {
					bw.write(1+"\n");
				}else {
					bw.write(0+"\n");
				}
				break;
			case "front" :
				if(q.isEmpty()) {
					bw.write(-1+"\n");
				}else {
					bw.write(q.peek()+"\n");
				}
				break;
			case "back" :
				if(q.isEmpty()) bw.write(-1+"\n");
				else {
					bw.write(last+"\n");
				}
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}

