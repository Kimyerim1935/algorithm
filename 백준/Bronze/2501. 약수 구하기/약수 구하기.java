import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= a; i++) {
            if (a%i == 0){
                list.add(i);
            }
        }

        if (list.size() <= b-1) {
            System.out.println(0);
        } else {
            System.out.println(list.get(b-1));
        }


    }
}