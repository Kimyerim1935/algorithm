import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();

        for(int i=0;i<n;i++){
            String result = in.next();

            System.out.println(result.toLowerCase());
        }
    }
}