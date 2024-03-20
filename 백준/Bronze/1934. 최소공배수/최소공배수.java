import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i = 0; i < T; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a * b / gcd(a, b));
		}
        in.close();
	}
	public static int gcd(int a, int b)
	{
	    if(b == 0) return a;
	    else return gcd(b, a % b);
	}
}