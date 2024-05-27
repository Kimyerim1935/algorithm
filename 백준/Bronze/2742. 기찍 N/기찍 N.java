import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int count = in.nextInt();
        
        for(int i=count; i>=1; i--){
            System.out.println(i);
        }
        
        in.close();
    }
}