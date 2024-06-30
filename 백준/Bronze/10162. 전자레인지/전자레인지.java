import java.util.Scanner;

public class Main {

    static int T, A, B, C;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        T = in.nextInt();

        solve();

        if(A != 0 || B != 0 || C != 0){ 
            System.out.print(A + " " + B + " " + C);
        }else{
            System.out.println(-1);
        }
    }

    private static void solve() {
        while(T > 0){
            A = T / 300;
            if(A > 0) T %= 300;

            B = T / 60;
            if(B > 0) T %= 60;

            C = T / 10;
            if(C > 0) T %= 10;

            if(0 < T && T < 10){
                A = 0; B = 0; C = 0;
                break;
            }
        }
    }
}