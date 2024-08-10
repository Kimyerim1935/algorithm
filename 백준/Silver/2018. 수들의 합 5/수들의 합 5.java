import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input = in.nextInt(); 
        int sum = 1;
        int start = 1; 
        int end = 1; 
        int count = 1; 

    
        while (start!=input){
            if(sum < input){
                end++;
                sum = sum + end;
                
            } else if (sum > input) {
                sum = sum - start;
                start++;
               
            }else {
                count++;
                end++;
                sum = sum + end;
            }
        }
        System.out.println(count);
    }
}