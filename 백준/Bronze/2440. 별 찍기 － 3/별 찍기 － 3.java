import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		in.close();

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}