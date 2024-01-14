import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
        
		int counter = in.nextInt();
		int[] arr = new int[counter];
        
		for (int i = 0; i < counter; i++) {
			arr[i] = in.nextInt();
		}
        
		in.close();
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[counter - 1]);
	}
}