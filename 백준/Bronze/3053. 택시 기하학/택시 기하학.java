import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double R = Double.parseDouble(br.readLine());
        double euclideanArea;
        double taxiArea;

        euclideanArea = R * R * Math.PI;
        taxiArea = 2 * R * R;
        
        System.out.println(euclideanArea);
        System.out.println(taxiArea);
    }
}