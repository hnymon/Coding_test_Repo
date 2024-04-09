import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int max = 0;
		int r = 0;
		int c = 0;
		for(int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				int n = Integer.parseInt(st.nextToken());
				if(max<=n) {
					max = n;
					r=i+1;
					c=j+1;
				}
			}
		}
		bw.write(String.valueOf(max)+"\n");
		bw.write(r+" "+c);
		bw.flush();
		bw.close();
		br.close();
	}
}
