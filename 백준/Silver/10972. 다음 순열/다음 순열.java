import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static int[] nums;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if(nextPermutation()) {
            for(int i=0; i<n; i++) System.out.print(nums[i] + " ");
        } else {
            System.out.println(-1);
        }
    }
    
    public static boolean nextPermutation() {
        int i = nums.length - 1;
        while(i>0 && nums[i-1] >= nums[i]) {
            i--;
        }
        
        if(i<=0) return false;

        int j = nums.length-1;
        
        while (nums[j] <= nums[i-1]) {
            j--;
        }
        swap(i-1, j);

     
        j = nums.length-1;
        while(i < j) {
            swap(i, j);
            i++;
            j--;
        }
        return true;
    }

    public static void swap(int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}