import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String s = br.readLine();
		// 일치하는 문자열을 0 으로 변환
        for(int i=0; i<cro.length; i++) {
			s = s.replaceAll(cro[i], "0");
		}
		int cnt =0;
        // 0 수 확인
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '0') {
				cnt ++;
			}
		}
        // 0을 "" 로 변환
		s = s.replace("0", "");
		bw.write(String.valueOf(cnt+s.length()));
		bw.flush();
		bw.close();
		br.close();
	}
}
