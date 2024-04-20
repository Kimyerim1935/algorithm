import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        StringBuilder sb = new StringBuilder();

        while(true) {
            str = br.readLine();
            if(str == null) {
                break;
            }
            sb.append(str).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}