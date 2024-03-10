import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int[] A = new int[count];
		
        for (int i = 0; i < count; i++) {
			A[i] = in.nextInt();
		}
		
        for(int i = 0; i < count - 1; i++) {
			for (int j = 0; j < count -1 -i; j++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(A[i]);
		}
	    in.close();
    }
}