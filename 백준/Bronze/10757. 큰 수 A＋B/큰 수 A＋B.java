import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger big1 = in.nextBigInteger();
        BigInteger big2 = in.nextBigInteger();
        
        in.close();
        System.out.println(big1.add(big2));
    }
}