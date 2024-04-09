import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = br.readLine();
        }
        int maxLen = 0;
        for (String str : arr) {
            maxLen = Math.max(maxLen, str.length());
        }
        StringBuilder sb = new StringBuilder();
        for (int c = 0; c < maxLen; c++) {
            for (int r = 0; r < 5; r++) {
                if (arr[r].length() > c) {
                    sb.append(arr[r].charAt(c));
                }
            }
        }
        String result = sb.toString();
        bw.write(result);
        bw.flush();
        br.close();
        bw.close();
    }
}
