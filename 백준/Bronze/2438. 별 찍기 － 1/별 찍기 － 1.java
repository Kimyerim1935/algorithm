import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totalCount = in.nextInt();
        
        in.close();
            
        for (int i = 1; i <= totalCount; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
}