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
		while(true) {
			String line = br.readLine();
			if(line.equals("."))break;
			if(g(line)) bw.write("yes"+"\n");
			else bw.write("no"+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	public static boolean g(String line) {
		Stack<Character> s = new Stack<>();
		for(int i=0; i<line.length(); i++) {
			if(line.charAt(i)=='(' || line.charAt(i)=='[') {
				s.push(line.charAt(i));
			} else if(line.charAt(i)==')') {
				if(s.isEmpty() || s.peek()=='[' ) {
					return false;
				} else s.pop();
			} else if(line.charAt(i)==']') {
				if(s.isEmpty() || s.peek()=='(') {
					return false;
				} else s.pop();
			}
		}
		if(s.size()==0) return true;
		else return false;
	}
}
