import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int sum=0;
        int min=M;
        
        for(int i=N; i>=M; i--) {
        	if(prime(i)==true) {
        		min=i;
        		sum += i;
        	}
        }
        if(sum==0) {
        	System.out.println(-1);
        }
        else {
        	System.out.println(sum);
        	System.out.println(min);
        }
        in.close();
    }
    static boolean prime(int i) {
    	if(i<2) {
    		return false;
    	}
    	for(int j=2; j<i; j++) {
    		if(i%j==0) {
    			return false;
    		}
    	}
    	return true;
    }
}