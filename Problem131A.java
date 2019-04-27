import java.util.*;

public class Problem131A{

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String input = sr.next();
        boolean flag1 = true; //true if characters beside the first are all capital letters
        boolean flag2 = !((int)input.charAt(0) >= 97 && (int)input.charAt(0) <= 122) ; //true if first is capital letter
        for (int i = 1; i < input.length(); i++) {
            if(! ((int)input.charAt(i) >= 65 && (int)input.charAt(i) <= 90)) {
                flag1 = false;
                break;
            }
        }

        if (flag1 && !flag2) {
            String first = input.substring(0,1);
            String other = input.substring(1);
            input = first.toUpperCase() + other.toLowerCase();
            System.out.print(input);
        }
        else if ( flag1 && flag2) {
            input = input.toLowerCase();
            System.out.print(input);
        }
        else System.out.print(input);
        sr.close();
    }
}