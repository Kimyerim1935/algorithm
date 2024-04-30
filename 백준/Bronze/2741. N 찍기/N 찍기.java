import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = Integer.parseInt(br.readLine());
        
        int i=1;
        while(i<= max){
            System.out.println(i);
            i++;
        }
        
        br.close();
    }
}
