import java.util.*;
import java.io.*;

public class Main{
    static int N;
    static int answer = -1;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        int fiveNum = N/5;
        int threeNum = 0;

        while(fiveNum>=0){
            int remain = N - (fiveNum*5);

            if(remain%3==0){
                threeNum = remain/3;
                answer = fiveNum + threeNum;
                break;
            }
            fiveNum--;
        }
        System.out.println(answer);
    }
}