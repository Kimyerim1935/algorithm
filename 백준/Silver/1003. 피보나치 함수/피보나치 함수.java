import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] fibonacci0;
    static int[] fibonacci1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        fibonacci0 = new int[41];
        fibonacci1 = new int[41];
        fibonacci0[0] = 1;
        fibonacci0[1] = 0;
        fibonacci1[0] = 0;
        fibonacci1[1] = 1;

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            System.out.println(fibonacci0[N] + " " + fibonacci1[N]);
        }
    }

    static void fibonacci(int n) {
        for(int k = 2; k <= n; k++){
            fibonacci0[k] = fibonacci0[k-1] + fibonacci0[k-2];
            fibonacci1[k] = fibonacci1[k-1] + fibonacci1[k-2];
        }
    }
}