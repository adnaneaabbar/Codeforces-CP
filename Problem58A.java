import java.util.*;


public class Problem58A {


    public static boolean containshello (String str) {
        int h= -1,e= -1,l1= -1,l2= -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'h') {
                h = i;
                break;
            }
            
        }
        if(h ==-1) return false;

        for (int i = h+1; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                e = i;
                break;
            }
        }
        if(e ==-1) return false;

        for (int i = e+1; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                l1 = i;
                break;
            }
        }
        if(l1 == -1) return false;

        for (int i = l1+1; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                l2 = i;
                break;
            }
        }
        if(l2 == -1) return false;

        for (int i = l2; i < str.length(); i++) {
                if (str.charAt(i) == 'o') {
                return true;
            }
        }
        return false;
    }
    public static void main( String[] args) {

        Scanner sr = new Scanner(System.in);
        String str = sr.next();

        if(containshello(str)) System.out.print("YES");
        else System.out.print("NO");
        sr.close();
    }
}
