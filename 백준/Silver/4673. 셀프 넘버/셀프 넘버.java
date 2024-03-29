public class Main {
    static int []self_number;
    static int brute_force (int n){
        int noself = n;

        while (n != 0){
            noself = noself + (n % 10); 
            n = n/10;
        }

        return noself;
    }
    
    public static void main (String[] args){
        StringBuilder sb = new StringBuilder();
        self_number = new int [10001];

        for(int i=1; i<self_number.length; i++){
            int number = brute_force(i);
            if(number<10001) { 
                self_number[number] = 1;
            }
        }

        for(int i=1; i<self_number.length; i++){
            if(self_number[i] == 0){
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }
}