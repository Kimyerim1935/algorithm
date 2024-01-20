import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        
        for (int x = 0; x < m; x++) {
            int i = in.nextInt();
            int j = in.nextInt();
            for (int y = 0; y < (j - i) / 2 + 1; y++) {
                int tmp = arr[i + y];
                arr[i + y] = arr[j - y];
                arr[j - y] = tmp;
            }
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }

        in.close();
    }
}
