import java.util.Scanner;
 
public class Main {
	
	public static long[] seq = new long[101];
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < 101; i++) {
			seq[i] = -1;
		}
		seq[0] = 0;
		seq[1] = 1;
		seq[2] = 1;
		seq[3] = 1;
		
		int T = in.nextInt();
		
		while(T-- > 0) {
			int N = in.nextInt();
			System.out.println(padovan(N));
		}
		
	}
	
	public static long padovan(int N) {
		if(seq[N] == -1) {	
			seq[N] = padovan(N - 2) + padovan(N - 3);
		}
		return seq[N];
	}
 
}