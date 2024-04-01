import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int a=0, b=1, c=0;

		for(int i=0;i<n;i++) {
			a = b;
			b = c;
			c = a+b;
		}
        in.close();
		System.out.println(c);
	}

}