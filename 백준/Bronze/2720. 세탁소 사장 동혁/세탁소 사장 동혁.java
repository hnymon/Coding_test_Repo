import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int q = 25;
		int d = 10;
		int n = 5;
		int p = 1;
		for(int i=0; i<a; i++) {
			int b = Integer.parseInt(br.readLine());
			int n1 = b/q;
			int n2 = (b-n1*q)/d;
			int n3 = (b-n1*q-n2*d)/n;
			int n4 = (b-n1*q-n2*d-n3*n)/p;
			bw.write(n1+" "+n2+" "+n3+" "+n4+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
