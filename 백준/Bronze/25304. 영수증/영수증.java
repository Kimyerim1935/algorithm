import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int totalPrice = in.nextInt();
        int productCount = in.nextInt();
        int sumPrice = 0;
        
        for (int i = 0; i < productCount; i++){
            int price = in.nextInt();
            int count = in.nextInt();
            sumPrice += price * count;
        }
        
        if (totalPrice == sumPrice){
           System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}