import java.util.Scanner;

public class Main {
	private static int n, m;
	private static int[] map;
	private static boolean[] visit;
	private static int[] result = new int[3];
	
	private static int sum = 0;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		m = in.nextInt();
		
		visit = new boolean[n+1];
		map = new int[n];
		for (int i=0; i<n; i++) {
			map[i] = in.nextInt();
		}
		
		dfs(0);
		in.close();
		System.out.print(sum);
	}

	private static void dfs(int start) {
		if (start == 3) {
			
			int hap = 0;
			for (int i : result) {
				hap += i;
			}

			if (hap > m) {
				return;
			}
			
			if (hap <= m) {
				sum = Math.max(sum, hap);
			}
			
		} else {
			for (int i=start; i<n; i++) {
				if (!visit[i]) {
					visit[i] = true;
					result[start] = map[i];
					dfs(start+1);
					visit[i] = false;
				}
			}
		}
		
	}
}