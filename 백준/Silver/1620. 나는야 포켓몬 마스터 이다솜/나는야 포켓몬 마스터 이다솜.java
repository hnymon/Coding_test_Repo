import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		// 이름, 번호
		HashMap<String, String> nmap = new HashMap<>();
		// 번호, 이름
		HashMap<String, String> imap = new HashMap<>();
		for(int i=1; i<=N; i++) {
			String name = br.readLine();
			nmap.put(name, String.valueOf(i));
			imap.put(String.valueOf(i), name);
		}
		int M = Integer.parseInt(st.nextToken());
		for(int i=0; i<M; i++) {
			String s = br.readLine();
			// 숫자일 때
			if(s.charAt(0)< 65) {
				bw.write(imap.get(s)+"\n");
			}
			// 영문일 때
			else {
				bw.write(nmap.get(s)+"\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
