import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringTokenizer st; 
		for(int i=0; i<N; i++) {
			String line = br.readLine();
			if(line.charAt(0)-'0'==1) {
				stack.push(Integer.parseInt(line.split(" ")[1]));
			}else if(line.charAt(0)-'0' ==2) {
				if(stack.isEmpty()) {
					bw.write(-1+"\n");
				} else {
					bw.write(stack.pop()+"\n");
				}
			}else if(line.charAt(0)-'0' ==3) {
				bw.write(stack.size()+"\n");
			}else if(line.charAt(0)-'0' ==4) {
				if(stack.isEmpty()) {
					bw.write(1+"\n");
				} else {
					bw.write(0+"\n");
				}
			}else if(line.charAt(0)-'0' ==5) {
				if(stack.isEmpty()) {
					bw.write(-1+"\n");
				} else {
					bw.write(stack.peek()+"\n");
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
