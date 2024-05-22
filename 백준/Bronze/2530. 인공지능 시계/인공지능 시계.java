import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int h = in.nextInt();
		int m = in.nextInt();
		int s = in.nextInt();
		int p = in.nextInt();
		
		s = s + p % 60;
		m = m + p / 60 % 60;
		h = h + p / 60 / 60;
		
		if(s >= 60) {
			h = h + s / 60 / 60;
			m = m + s / 60;
			s = s % 60;
		}
		
		if(m >= 60) {
			h = h + m / 60;
			m = m % 60;
		}
		
		if(h >= 24) {
			h = h % 24;
		}
		System.out.println(h + " " + m + " " + s);
		in.close();
	}
}