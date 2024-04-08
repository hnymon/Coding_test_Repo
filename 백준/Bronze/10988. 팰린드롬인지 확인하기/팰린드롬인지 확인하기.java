import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int r = 0;
		for(int i=0; i<s.length()/2; i++) {
			if(s.charAt(i) == s.charAt(s.length()-i-1)) {
				r = 1;
				continue;
			}else {
				r=0;
				break;
			}
		}
        if(s.length() ==1 ) r = 1;
		bw.write(String.valueOf(r));
		bw.flush();
		bw.close();
		br.close();
	}
}
