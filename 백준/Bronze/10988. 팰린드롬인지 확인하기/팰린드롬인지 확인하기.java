import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		in.close();
		int a = str.length();
		int ans = 1;
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		for(int i=0;i<a/2;i++) {
			if(str.charAt(i) != sb.charAt(i)) {
				ans = 0;
			}
		}
		System.out.println(ans);
		
	}
}