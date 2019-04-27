import java.util.*;

/**
 * first
 */
public class Problem1029A {


    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int k = sr.nextInt();
        String input = sr.next();
        int sub_index = 0;

        for (int i = n-1; i >= 0 ; i--) {
            if(input.substring(0, i).equals(input.substring(n-i))){
            sub_index = i;
            break;
            }
        }

        System.out.print(input);
        for(int i = 1; i < k; i++) System.out.print(input.substring(sub_index));

        
        sr.close();
    }
}