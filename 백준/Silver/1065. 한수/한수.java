import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  

public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        int N = Integer.parseInt(br.readLine());  

        int cnt = 0;  
        for (int i = 1; i <= N; i++) {  
            if (cd(i)) {  
                cnt++;  
            }  
        }  
        System.out.println(cnt);  
    }  

    public static boolean cd(int i) {  
        char[] ch = Integer.toString(i).toCharArray();  

        if (ch.length == 1 || ch.length == 2) return true;  

        int diff = ch[0] - ch[1];  
        if (ch[1] - ch[2] == diff) return true;  
        else return false;  
    }  
}