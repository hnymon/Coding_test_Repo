
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int getSolution(int row, int col, String[] board) {
		String[] wb = {"WBWBWBWB", "BWBWBWBW"};
		int ws = 0;
		for(int i=0; i<8; i++) {
			int r = row + i;
			for(int j=0; j<8; j++) {
				int c = col + j;
				if(board[r].charAt(c) != wb[r % 2].charAt(j)) {
					ws ++;
				}
			}
		}
		return Math.min(ws,  64-ws);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken()); 
		int col = Integer.parseInt(st.nextToken()); 
		
		// 전체 판
		String[] board = new String[row]; 
		for(int i=0; i<row; i++) {
			st = new StringTokenizer(br.readLine());
			board[i] = st.nextToken();
		}
		// 체스판 자르기
		int sol = Integer.MAX_VALUE;
		for(int i=0; i<row-7; i++) {
			for(int j=0; j<col-7; j++) {
				// 체스판의 최소 변경 값
				int curSol = getSolution(i, j, board);
				// 최솟값과 비교 후 갱신
				if(sol > curSol) sol = curSol;
			}
		}
		bw.write(sol+"");
		bw.flush();
		bw.close();
		bw.close();
	}
	
}
