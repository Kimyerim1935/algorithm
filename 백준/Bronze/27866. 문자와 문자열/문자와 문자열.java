import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String answer = in.next();
		int n = in.nextInt()-1;
		
		System.out.println(answer.charAt(n));
		
		in.close();
	}
}