import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =  new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] score = new int[a];

        st =  new StringTokenizer(br.readLine());

        for(int i = 0; i < a; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(score);

        bw.write(score[a-b] +"");
        bw.flush();
        bw.close();
    }
}