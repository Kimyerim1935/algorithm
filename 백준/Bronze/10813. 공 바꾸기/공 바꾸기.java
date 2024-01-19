import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int basket = in.nextInt();
        int M = in.nextInt();

        int[] basketArray = new int[basket];
        for(int i = 0; i < basket; i++){
            basketArray[i] = i + 1;
        }

        for(int i = 0; i < M; i++){
            int A = in.nextInt()-1;
            int B = in.nextInt()-1;

            int temp = basketArray[A];
            basketArray[A] = basketArray[B];
            basketArray[B] = temp;
        }

        for(int i = 0; i < basket; i++){
            System.out.print(basketArray[i] + " ");
        }
    }
}