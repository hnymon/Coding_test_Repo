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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] basket = new int[N];
		for(int i=0; i<basket.length; i++) {
			basket[i] = i+1;
		}
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken())-1;
			int n2 = Integer.parseInt(st.nextToken())-1;
			int tmp = basket[n1];
			basket[n1] = basket[n2];
			basket[n2] = tmp;
		}
		for(int i=0; i<basket.length; i++) {
			if(i == basket.length-1) {
				bw.write(basket[i]+"");
				break;
			}
			bw.write(basket[i]+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
