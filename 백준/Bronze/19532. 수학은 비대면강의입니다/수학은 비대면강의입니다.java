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
		// ax + by = c
		// dx + ey = f
		StringTokenizer st = new StringTokenizer(br.readLine());
		double a = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());
		double c = Integer.parseInt(st.nextToken());
		double d = Integer.parseInt(st.nextToken());
		double e = Integer.parseInt(st.nextToken());
		double f = Integer.parseInt(st.nextToken());
		for(int x=-999; x<1000; x++) {
			for(int y=-999; y<1000; y++) {
				if( a*x + b*y == c && d*x + e*y == f) {
					bw.write(x+" "+y);
					break;
				}
			}
		}
		bw.flush();
		bw.close();
		bw.close();
	}
}
