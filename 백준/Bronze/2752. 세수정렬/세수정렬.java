import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int[] numArr = new int[3];
        for (int i = 0; i < 3; i++) {
            numArr[i] = in.nextInt();
        }
        
        Arrays.sort(numArr);
        
        for (int i = 0; i < 3; i++) {
            System.out.print(numArr[i] + " ");
            
        }
    }
}