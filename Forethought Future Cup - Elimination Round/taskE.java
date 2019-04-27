import java.util.*;

/**
 * taskE
 * Time limit exceeded on pretest 8
 */
public class taskE {

    public static int[] negsmall(int [] a , int test) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] < test) a[i] = -a[i];
        }
        return a;
    }

    public static int[] negbig(int [] a , int test) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] > test) a[i] = -a[i];
        }
        return a;
    }

    public static String print(int [] a ){
        String s = "";
        for (int i = 0; i < a.length; i++) {
            s+= a[i] +" ";
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int [] a = new int[n]; 
        int q = sr.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sr.nextInt();
        }

        for (int k = 0; k < q; k++) {
            int [] b = a.clone();
            char symbol = sr.next().charAt(0);
            if (symbol == '<'){
                int test = sr.nextInt();
                a = negsmall(b, test);
            }
            else {
                int test = sr.nextInt();
                a = negbig(b, test);
            }
        }
        System.out.print(print(a));
        sr.close();

    }


}