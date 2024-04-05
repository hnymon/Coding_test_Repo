import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[9];
		int max = 1;
		int index = 0;
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) {
				max = arr[i];
				index = i+1;
			}
		}
		bw.write(max + "\n" + index);
		bw.flush();
		bw.close();
		br.close();
	}
}
