import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int S=0,T=0;
		
		for(int i =0; i <4; i++) {
			S += in.nextInt();
		}
		
		for(int i =0; i <4; i++) {
			T += in.nextInt();
		}
		
		if( S >= T) {
			System.out.println(S);
		} else {
			System.out.println(T);
		}
		
		in.close();
	}
}