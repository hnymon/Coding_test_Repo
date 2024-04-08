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
		int[] alp = new int[26];
		for(int i=0; i<alp.length; i++) {
			alp[i] = -1;
		}
		for(int i=0; i<s.length(); i++) {
			if(alp[(int)s.charAt(i)-97] == -1)
				alp[(int)s.charAt(i)-97] = i;
		}
		for(int i=0; i<alp.length; i++) {
			if(i==alp.length-1) {
				bw.write(alp[i]+"");
				break;
			}
			bw.write(alp[i]+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
