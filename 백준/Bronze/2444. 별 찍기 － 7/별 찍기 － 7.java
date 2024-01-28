import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder st = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i; j++) {
                st.append(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                st.append("*");
            }
            st.append("\n");
        }
        for (int i = num-1; i >= 1; i--) {
            for (int j = 1; j <= num-i; j++) {
                st.append(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                st.append("*");
            }
            st.append("\n");
        }
        System.out.print(st);
    }
}