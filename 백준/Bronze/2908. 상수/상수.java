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
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String s3 = "";
		String s4 = "";
		for(int i=0; i<3; i++) {
			s3 += s1.charAt(2-i);
			s4 += s2.charAt(2-i);
		}
		int n1 = Integer.parseInt(s3);
		int n2 = Integer.parseInt(s4);
		int max = n1;
		if(max < n2) {
			max = n2;
		}
		bw.write(max+"");
		bw.flush();
		bw.close();
		br.close();
	}
}
