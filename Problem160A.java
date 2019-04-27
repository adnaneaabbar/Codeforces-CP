import java.util.*;

public class Problem160A{

    public static void main(String[] args) {
        
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int answer = 1;
        int [] values = new int [n];
        int [] presum = new int [n];

        for (int i = 0; i < n; i++) {
            values[i] = sr.nextInt();
        }
        Arrays.sort(values);
        presum[0] = values[0];
        for (int i = 1; i < n; i++) {
            presum[i] = presum[i-1] + values[i];        
        }  

        for (int i = values.length-1; i > 0 ; i--) {
            if((presum[values.length-1] - presum[i-1]) > presum[i-1]) {
            break;
            }
            answer++;
        }
        System.out.print(answer);
        sr.close();
    }
        
}