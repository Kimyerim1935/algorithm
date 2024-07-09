import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int k = in.nextInt();
    	boolean[] prime = new boolean[n + 1];
    	
    	int count = 0;
    	for(int i = 2; i <= n; i++) {
    		for(int j = i; j <= n; j += i) {
    			if(prime[j] == false) {
        			count++;
        			prime[j] = true;
    			}

    			if(count == k) {
    				System.out.println(j);
    				System.exit(0);
    			}
    		}
    	}
    }
}