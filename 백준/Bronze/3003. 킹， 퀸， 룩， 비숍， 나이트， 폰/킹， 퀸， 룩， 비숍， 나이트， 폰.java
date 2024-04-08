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
		int[] normal = {1,1,2,2,2,8};
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<6; i++) {
			if(i==5) {
				bw.write(normal[i]- Integer.parseInt(st.nextToken())+"");
				break;
			}
			bw.write(normal[i]- Integer.parseInt(st.nextToken())+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
