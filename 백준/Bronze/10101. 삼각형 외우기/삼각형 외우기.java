import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int r1 = Integer.parseInt(br.readLine());
		int r2 = Integer.parseInt(br.readLine());
		int r3 = Integer.parseInt(br.readLine());
		String s = "";
		if(r1+r2+r3 != 180) {
			s = "Error";
		} else {
			if(r1==60 && r2==60 && r3==60) {
				s = "Equilateral";
			} else if(r1 ==r2 || r2 ==r3 || r3 == r1) {
				s = "Isosceles";
			} else {
				s = "Scalene";
			}
		}
		bw.write(s);
		bw.flush();
		bw.close();
		br.close();
	}
}
