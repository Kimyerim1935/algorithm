import java.util.Scanner;

public class Main {
    public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
    	int N = in.nextInt(); 
    	int [] ring = new int [N]; 
    	for(int i=0; i<N; i++) {
    		ring[i] = in.nextInt();
    	}
    	
    	for(int j=1; j<N; j++) {
    		int num = 0;         
    		for(int k=1; k<=ring[j]; k++) { 
    			if(ring[0]%k==0&&ring[j]%k==0) 
    				num = k;
    		}
    		System.out.println((ring[0]/num)+"/"+(ring[j]/num));
    	}
    }
}