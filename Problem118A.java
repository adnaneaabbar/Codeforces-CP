import java.util.Scanner;

public class Problem118A {
    
    static char[] vowels = {'a','e','i','o','u','y'};

	public static boolean isvowel( char c) {
        for (int i = 0; i < vowels.length ;  i++) {
            if (c == vowels[i]) return true;
        }
        return false;
    }
	public static void main(String args[])
	{
		Scanner sr = new Scanner(System.in);

        String str = sr.next();
        str = str.toLowerCase();

        for ( int i = 0 ; i<str.length() ; i++ ){
            
            if(isvowel(str.charAt(i))) {continue;}
            else{
                System.out.print('.'+ Character.toString(str.charAt(i)));
            }
        }
        sr.close();		
	}
}