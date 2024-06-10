import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String string = in.next();
		String reverse = "";
		
		for(int i = string.length() - 1; i >= 0; i--) {
			reverse += string.charAt(i);
		}
		
		System.out.println(reverse);
		in.close();
	}
}