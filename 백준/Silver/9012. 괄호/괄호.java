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
		for(int i=0; i<N; i++) {
			if(g(br.readLine())) {
				bw.write("YES"+"\n");
			}else {
				bw.write("NO"+"\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
	public static boolean g(String line) {
		Stack<Boolean> s = new Stack<>();
		for(int i=0; i<line.length(); i++) {
			if(line.charAt(i)==')') {
				if(s.size()==0) {
					return false;
				}else {
					s.pop();
				}
			} else {
				s.push(true);
			}
		}
		if(s.size()==0) return true;
		else return false;
	}
}
