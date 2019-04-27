import java.util.*;


public class Problem263A {

    public static void main( String[] args) {
        Scanner sr = new Scanner(System.in);
        int c = 0;
        int r = 0;
        int s;
        for(int i = 1 ; i < 6 ; i++){

            for(int j = 1 ; j < 6 ; j++){
                s = sr.nextInt();
                if (s==1) {
                    c=j;
                    r=i;
                }
            }
        }
        if(c<=3 && r<=3) System.out.print(6-c-r);
        if(c<=3 && r>3) System.out.print(r-c);
        if(c>3 && r<3) System.out.print(c-r);
        if(c>3 && r>=3) System.out.print(r+c-6);

    }
}