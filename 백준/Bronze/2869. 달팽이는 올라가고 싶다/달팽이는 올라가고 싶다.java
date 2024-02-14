import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int height = in.nextInt();
 
		int day = (height - n) / (m - n);
        
		if ((height - n) % (m - n) != 0) {
			day++;
		}
        in.close();
		System.out.println(day);
	}
}