import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i=0; i<n1; i++) {
			int a = Integer.parseInt(st1.nextToken());
			if(a < n2) {
				bw.write(a + " ");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
