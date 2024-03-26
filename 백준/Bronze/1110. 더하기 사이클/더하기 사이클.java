import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int start = N;
		in.close();
		
		int count = 0;
		
		while(true) {
			N = (N%10*10)+((N/10+N%10)%10);
			count ++;
			if(start == N) {
				break;
			} 
		}
		System.out.print(count);
	}
}