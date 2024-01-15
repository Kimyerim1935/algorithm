import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        int answer = 0;
    
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        
        int value = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                answer++;
            }    
        }
        System.out.println(answer);
	}
}