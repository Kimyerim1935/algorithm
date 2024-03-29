import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(arr);

        System.out.println(Math.round(Arrays.stream(arr).average().orElse(0)));
        System.out.println(arr[2]);
    }
}