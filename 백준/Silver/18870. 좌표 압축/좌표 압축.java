import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		// 2 4 -10 4 -9
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// set 에 담아서 중복 제거
		// 2 4 -10 -9
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<N; i++) {
			set.add(arr[i]);
		}
		// 새로운 배열에 담은 후 정렬 : 인덱스화 시키기 위함
		Iterator<Integer> it = set.iterator();
		int[] iArr = new int[set.size()];
		int idx = 0;
		while(it.hasNext()) {
			iArr[idx] = it.next();
			idx++;
		}
		// -9 -10 2 4
		//  0   1 2 3
		Arrays.sort(iArr);
		// key : 해당 값
		// val : 인덱스
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<iArr.length; i++) {
			map.put(iArr[i], i);
		}
		// 처음의 배열을 map을 이용해 변환 후 bw에 담기
		for(int i=0; i<N; i++) {
			arr[i] = map.get(arr[i]);
			bw.write(arr[i]+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
