import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] croatias = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = in.next();
        
        for (int i = 0; i < croatias.length; i++) {
            if (str.contains(croatias[i]))
                str = str.replace(croatias[i], "@");
        }
        System.out.println(str.length());
        in.close();
    }
}