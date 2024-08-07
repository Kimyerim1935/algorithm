import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] cnt = new int[5];
        int n = in.nextInt();
        String buf = in.nextLine();
        
        for(int i=0; i<n; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            
            if(x==0 || y==0){
                cnt[4]++;
            }
            else if(x>0){
                if(y>0){
                    cnt[0]++;
                }
                else{
                    cnt[3]++;
                }
            }
            else {
                if(y>0){
                    cnt[1]++;
                }
                else {
                    cnt[2]++;
                }
            }
        }
        
        for(int i=0; i<5; i++){
            if(i<4){
                System.out.println("Q" + (i+1) + ": " + cnt[i]);
            }
            else{
                System.out.println("AXIS: " + cnt[4]);
            }
        }
  
        in.close();
    }
}

