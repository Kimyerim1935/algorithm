import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                int n = Integer.parseInt(br.readLine());
                if (n < 40) n = 40;
                sum += n;
            }
            br.close();
            System.out.print(sum / 5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}