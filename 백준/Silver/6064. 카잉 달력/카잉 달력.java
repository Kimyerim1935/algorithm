import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for (int s = 0; s < T; s++) {

			boolean check = false;
			int m = in.nextInt();
			int n = in.nextInt();
			int x = in.nextInt() - 1;
			int y = in.nextInt() - 1;

			for (int i = x; i < (n * m); i += m) {
				if (i % n == y) {
					System.out.println(i + 1);
					check = true;
					break;
				}
			}

			if (!check) {
				System.out.println(-1);
			}
		}
	}
}
