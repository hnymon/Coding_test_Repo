import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=1; i<=a; i++) {
			for(int j=a-i; j>0; j--) {
				bw.write(" ");
			}
			for(int j=0; j<i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.close();
		br.close();
	}
}
