import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[] N = new int[n + 1];
            for(int j = 1; j <= n; j++) {
                N[j] = j;
            }
            for(int j = 1; j <= k; j++) {
                for(int m = 2; m <= n; m++) {
                    N[m] = N[m - 1] + N[m];
                }
            }
            sb.append(N[n]).append("\n");
        }
        System.out.println(sb);
    }
}
 