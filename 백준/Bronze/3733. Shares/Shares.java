import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, s;
        
        while(in.hasNext()){
            n = in.nextInt();
            s = in.nextInt();
            System.out.println(s/(n+1));
        }
    }
}