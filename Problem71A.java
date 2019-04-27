import java.util.*;
public class Problem71A{
    public static void main(String[] args ){
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        String [] answers = new String[t];
        for (int i = 0 ; i < t ; i++){
            String str = sr.next();
            if(str.length() <= 10) answers[i] = str;
            else{
                answers[i] = str.charAt(0) + Integer.toString(str.length()-2) + str.charAt(str.length()-1);
            }
        }
        for ( int i = 0 ; i < answers.length ; i++){
            System.out.println(answers[i]);
        }
        sr.close();
    }
}