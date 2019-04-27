import java.util.*;

/**
 * taskA
 */
public class taskA {

    public static int count_a(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a') count++;
        }
        return count;
    }

    public static int count_nona(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != 'a') count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String input = sr.next();
        int a = count_a(input);
        int nona = count_nona(input);
        if (a > nona) System.out.print(input.length());
        else if (a <= nona) System.out.print(input.length() - nona + a - 1);
        sr.close();
    }
}