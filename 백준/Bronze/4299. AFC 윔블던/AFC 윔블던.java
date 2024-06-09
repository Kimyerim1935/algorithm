import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		int sum = Integer.parseInt(st.nextToken());
		int sub = Integer.parseInt(st.nextToken());
		int winner = (sum+sub)/2;
		int loser = winner-sub;
		if(sum<sub||(sum+sub)%2!=0) {
			System.out.println(-1);
		}
        else {
			System.out.println(winner+" "+loser);
		}
	}
}