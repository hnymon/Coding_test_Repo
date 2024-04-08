import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[28];
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<28; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		for(int i=1; i<=30; i++) {
			// binarySearch(배열, 찾을값) 찾는 값이 없을 시 음수 반환
			// 사용 전 정렬을 해야 함
			if(Arrays.binarySearch(arr, i) <0) {
				bw.write(i + "\n");
			};
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
