import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Gnomes:");
        
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			
			if(a >= b && b >= c || a <= b && b <= c) {
				System.out.println("Ordered");
			}else {
				System.out.println("Unordered");
			}
		}
		in.close();
	}
}