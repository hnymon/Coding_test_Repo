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
		if(s.equals(" ")||s.equals("")) {
			bw.write(0+"");
		} else {
			String[] arr = s.trim().split(" ");
			bw.write(String.valueOf(arr.length));
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
