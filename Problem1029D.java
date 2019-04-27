import java.util.*;


/**
 * fourth
 * Time limit exceeded on test 8
 */
public class Problem1029D {


    public static long concat(long x , long y) {
        return Long.parseLong(Long.toString(x)  +  Long.toString(y));
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int answer = 0;
        int n = sr.nextInt();
        long [] a = new long [n];
        long k = sr.nextLong();
        for (int i = 0; i < n; i++) {
            a[i] = sr.nextLong();
        }

        for (int i = 0; i < n; i++) {

            for (int j =0 ; j < n; j++) {
             
                if(i!=j){
                    if (concat(a[i], a[j]) % k == 0) answer++;
                }

            }

        }

        System.out.print(answer);
        sr.close();

    }
}