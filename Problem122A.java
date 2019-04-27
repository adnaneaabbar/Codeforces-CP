import java.util.*;

public class Problem122A{


    public static boolean isLucky(int n) {
        String str = Integer.toString(n);
        boolean flag=true;
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == '4' || str.charAt(i) == '7') continue;
            else {
                flag = false;
                break;
            }
        }
        return flag ? true : false;
    }

    public static boolean isAlmostLucky(int n) {
        for (int i = 0; i <= n/2 + 1; i++) {
            if(isLucky(i) && (n%i == 0)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        if(isLucky(n) || isAlmostLucky(n)) System.out.print("YES");
        else System.out.print("NO");
        sr.close();
    }
}