import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	String nStr = in.nextLine();
    	int f = in.nextInt();
    	
    	char[] arrCh = nStr.toCharArray();
    	arrCh[arrCh.length-1] = '0';
    	arrCh[arrCh.length-2] = '0';
    	
    	int num = Integer.parseInt(new String(arrCh));
    	for(int i=0; i<100; i++) {
    		if(num % f == 0) {
    			System.out.printf("%02d", i);
    		break;	
    		} else {
    			num++;
    		}
    	}
    }
}