import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = Integer.parseInt(in.nextLine());
		for (int i = 0; i < N; i++) {
			String str = in.nextLine();

			System.out.println((str.charAt(0) + "").toUpperCase() + str.substring(1, str.length()));
		}

		in.close();
	}
}