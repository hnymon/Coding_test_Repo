import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		int cook = Integer.parseInt(br.readLine());
		if(minute + cook == 60) {
			hour ++;
			minute =0;
		} else if(minute + cook > 60) {
			hour += (minute + cook)/60;
			minute = (minute + cook)%60;
		}else {
			minute += cook;
		}
		if(hour >= 24) hour -=24;
		System.out.println(hour + " " + minute);
		br.close();
	}
}
