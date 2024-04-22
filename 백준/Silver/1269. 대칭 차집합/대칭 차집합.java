import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		// 1 2 4
		for(int i=0; i<N; i++) {
			set1.add(Integer.parseInt(st.nextToken()));
		}
		Set<Integer> set1c = new HashSet<>(set1);
		// 2 3 4 5 6
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			set2.add(Integer.parseInt(st.nextToken()));
		}
		Set<Integer> set2c = new HashSet<>(set2);
		// set1 에서 set2 에 있는 것 지우기
		Iterator<Integer> it1 = set2c.iterator();
		while(it1.hasNext()) {
			set1.remove(it1.next());
		}
		Iterator<Integer> it2 = set1c.iterator();
		while(it2.hasNext()) {
			set2.remove(it2.next());
		}
		bw.write(set1.size()+set2.size()+"");
		bw.flush();
		bw.close();
		br.close();
	}
}
