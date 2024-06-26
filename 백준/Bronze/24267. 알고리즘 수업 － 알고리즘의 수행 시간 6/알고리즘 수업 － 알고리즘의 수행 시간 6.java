import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long n = Integer.parseInt(br.readLine());
		long res = 0;
		long a = 0;
		if(n>2) {
			for(int i=1; i<n-1; i++) {
				a += i;
				res += a;
			}
		}
		bw.write(res+"\n");
		bw.write(3+"");
		bw.flush();
		bw.close();
		br.close();
	}
}
