import java.util.*;


public class Problem271A{
 
    public static boolean distinctdigits(String str) {
        boolean condition = str.charAt(0)!=str.charAt(1) && str.charAt(0)!=str.charAt(2) && str.charAt(0)!=str.charAt(3) && str.charAt(1)!=str.charAt(2) && str.charAt(1)!=str.charAt(3) && str.charAt(2)!=str.charAt(3);
        if(condition) return true;
        return false;
    }
    public static void main(String[] args ){

        Scanner sr = new Scanner(System.in);
        int year = sr.nextInt();
        year++;
        String str = Integer.toString(year);

        while(true){
            if(distinctdigits(str)){
                break;
            }
            year++;
            str = Integer.toString(year);
        }
        System.out.print(year);
        sr.close();
    }
}