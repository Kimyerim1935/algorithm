import java.util.*;

public class Main {
	static int T;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		
		for(int i=0;i<T;i++) {
			int X= in.nextInt();	
			int Y= in.nextInt();	
			
			int dist = Y-X;
			int cnt=0;	
			
			int max = (int)Math.sqrt(dist);	
			
			if(max == Math.sqrt(dist)) {
				System.out.println(max * 2 - 1);
			}
			else if(dist <= max * max + max) {
				System.out.println(max * 2);
			}
			else {
				System.out.println(max * 2 + 1);
			}
		}
	}
	
}