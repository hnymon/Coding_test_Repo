import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int[] arr = new int[3];
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			for(int i=0; i<3; i++) {
				arr[i] = Integer.parseInt(st.nextToken()); 
			}
			if(arr[0]==0 && arr[1]==0 && arr[2]==0) {
				break;
			}
			Arrays.sort(arr);
			int max = arr[2];
			if(max>= arr[0] + arr[1]) {
				bw.write("Invalid"+"\n");
			} else {
				if(arr[0]==arr[1] && arr[0]== arr[2]) bw.write("Equilateral"+"\n");
				else if(arr[0]==arr[1] || arr[0]== arr[2] || arr[1] == arr[2]) bw.write("Isosceles"+"\n");
				else bw.write("Scalene"+"\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
