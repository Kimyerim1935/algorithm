import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int[] answers = new int[n];
        for (int i = 0; i < n; i++) {
            answers[i] = in.nextInt();
        }
        
        int result = calcTotalScore(n, answers);
        
        System.out.print(result); 
    }
    
    public static int calcTotalScore(int n, int[] answers) {
        int score = 0;
        int consecutiveCorrect = 0; 
        
        for (int i = 0; i < n; i++) {
            if (answers[i] == 1) {
                consecutiveCorrect++;
                score += consecutiveCorrect; 
            } else {
                consecutiveCorrect = 0; 
            }
        }
        
        return score;
    }
    
}