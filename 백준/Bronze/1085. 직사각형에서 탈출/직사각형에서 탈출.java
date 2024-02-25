import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
        
		int a = Math.min(x, w-x);
		int b = Math.min(y, h-y);
        
		System.out.println(Math.min(a, b));
	}
 
}