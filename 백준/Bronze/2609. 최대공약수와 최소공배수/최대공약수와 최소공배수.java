import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
    
        int gcd = getGCD(num1, num2); 

        br.close();
        System.out.println(gcd);
        System.out.println(((num1*num2)/gcd));
        
    }

    private static int getGCD(int num1, int num2) {
        if (num1%num2 == 0) return num2;
        return getGCD(num2, num1%num2);
    }
}