import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arrS = br.readLine().toUpperCase().split("");

        // 각 알파벳의 등장 횟수를 저장할 Map
        Map<String, Integer> map = new HashMap<>();

        // 각 알파벳의 등장 횟수 계산
        for (String s : arrS) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int max = 0;
        String ss = "";

        // 가장 많이 등장하는 알파벳 찾기
        for (Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ss = entry.getKey();
            }else if(entry.getValue() == max) {
            	max = entry.getValue();
            	ss = "?";
            }
        }
        bw.write(ss);
        bw.flush();
        bw.close();
        br.close();
    }
}
