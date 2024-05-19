import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] bowls = new int[3];
        Scanner in = new Scanner(System.in);

        for(int i=0; i<3; i++){
            bowls[i]=in.nextInt();
        }

        Arrays.sort(bowls);

        System.out.println(bowls[1]);
    }
}