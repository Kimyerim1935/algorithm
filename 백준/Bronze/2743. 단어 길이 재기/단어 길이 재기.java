import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String answer = in.next();
        in.close();
        System.out.println(answer.length());
    }
}