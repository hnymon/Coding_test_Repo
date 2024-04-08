import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int a = 0;
		for(int i=0; i<N; i++) {
			// 나왔던 알파벳인지 확인
			boolean[] arr = new boolean[26];
			String s = br.readLine();
			// 첫 알파벳
			arr[(int)s.charAt(0) - 'a'] = true;
			for(int j=1; j<s.length(); j++) {
				char c = s.charAt(j);
				// 전 알파벳과 같으면 continue;
				if(c == s.charAt(j-1)) continue;
				// 전과 다른 알파벳인데 이미 true인 경우 한 번 이상 들어갔던 것
				if(arr[(int)c-'a']) {
					a++;
					break;
				}
				// 새로운 알파벳 등장시 true;
				arr[(int)c -'a'] = true;
			}
		}
		bw.write(String.valueOf(N-a));
		bw.flush();
		bw.close();
		br.close();
	}
}
