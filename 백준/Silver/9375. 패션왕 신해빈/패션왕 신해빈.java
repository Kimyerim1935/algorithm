import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			String[][] clothes = new String[M][2];
			HashMap<String,Integer> hm = new HashMap<>(); 
			for (int j = 0; j < M; j++) {
				String[] str = br.readLine().split(" ");
				hm.put(str[1],hm.getOrDefault(str[1],0)+1);
			}
			choice(hm);
		}

	}

	static void choice(HashMap h) {
		 ArrayList<Integer> arr=new ArrayList<>(h.values());
		 int res=1;
		 for(int val: arr) {
			 res*=(val+1);	
		 }
		 		 
		 System.out.println(res-1);	
	}
}