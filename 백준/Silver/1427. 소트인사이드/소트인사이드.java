import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int[] arr = new int[s.length()];
		for(int i=0; i<s.length(); i++) {
			arr[i] = s.charAt(i)-'0';
		}
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[arr.length-1-i]);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
