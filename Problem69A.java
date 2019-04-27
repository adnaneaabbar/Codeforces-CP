import java.util.*;


public class Problem69A {

    public static void main( String[] args) {
        Scanner sr = new Scanner(System.in);
        int temp;
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int n = sr.nextInt();

        for(int i = 0 ; i < n ; i++){
            temp = sr.nextInt();
            s1 = s1 + temp;
            temp = sr.nextInt();
            s2 = s2 + temp;
            temp = sr.nextInt();
            s3 = s3 + temp;
        }
        if(s1==0 && s2==0 && s3==0) System.out.print("YES");
        else System.out.print("NO");
    }
}
