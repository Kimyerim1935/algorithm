import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		String answer = "";
		scan.close();
		
		for(int i=1; i<=a/4; i++) {
			answer += "long ";
		}
		System.out.println(answer + "int");

	}
}