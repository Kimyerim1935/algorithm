import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        StringBuilder binary = new StringBuilder(in.next());
        int length = binary.length();
        StringBuilder answer = new StringBuilder();
        
        if (length % 3 == 1) binary.insert(0, "00");
        else if (length % 3 == 2) binary.insert(0, "0");
        
       
        for (int i = 0; i < length; i += 3) {
            answer.append(binaryToDecimal(binary.substring(i, i + 3)));
        }
        
        System.out.println(answer);
    }

    public static String binaryToDecimal(String b) {
        int sum = 0;
        int i = 1;

        int a = Integer.parseInt(b);
        while (a > 0) {
            sum += i * (a % 10);
            i = i * 2; 
            a /= 10;
        }
        return Integer.toString(sum);
    }
}