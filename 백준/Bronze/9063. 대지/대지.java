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
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int minX = 0;
		int maxX = 0;
		int minY = 0;
		int maxY = 0;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(i==0) {
				minX = x;
				minY = y;
				maxX = x;
				maxY = y;
			}
			if(minX>x) minX = x;
			if(minY>y) minY = y;
			if(maxX<x) maxX = x;
			if(maxY<y) maxY = y;
		}
		bw.write((maxX-minX)*(maxY-minY)+"");
		bw.flush();
		bw.close();
		br.close();
	}
}
